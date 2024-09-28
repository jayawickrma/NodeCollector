package lk.ijse.nodecollecter.service.IMPL;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceIMPL implements UserService {
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO getUser(String id) {
        return null;
    }

    @Override
    public void deleteNote(String id) {

    }

    @Override
    public void updateUser(String id, UserDTO userDTO) {

    }
}
