package lk.ijse.nodecollecter.service.IMPL;

import jakarta.transaction.Transactional;
import lk.ijse.nodecollecter.DAO.UserDAO;
import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.Entity.EntityIMPL.UserEntity;
import lk.ijse.nodecollecter.Utill.Mapping;
import lk.ijse.nodecollecter.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceIMPL implements UserService {
  @Autowired
   private UserDAO userDAO;
  @Autowired
  private Mapping mapping;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        UserEntity saveuser=userDAO.save(mapping.toUserEntity(userDTO));
        return mapping.touserDTO(saveuser);
    }

  @Override
  public List<UserDTO> getAllUsers() {
    return null;
  }



    @Override
    public UserDTO getUser(String userID) {
      UserEntity selectedUser=  userDAO.getReferenceById(userID);
      return mapping.touserDTO(selectedUser);
    }

    @Override
    public UserDTO deleteUser(String id) {
      userDAO.deleteById(id);
      return null;
    }

    @Override
    public void updateUser(String id, UserDTO userDTO) {

    }
}

