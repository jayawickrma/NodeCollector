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
    List<UserEntity> allUsers = userDAO.findAll();
    return mapping.allUsers(allUsers);
  }

  @Override
  public UserDTO getUser(String userId) {
    UserEntity selectedUser = userDAO.getReferenceById(userId);
    return mapping.touserDTO(selectedUser);
  }

  @Override
  public void deleteUser(String userId) {
      userDAO.deleteById(userId);
  }

  @Override
  public void updateUser(String userId, UserDTO userDTO) {
      userDAO.findById(userId);
  }
}

