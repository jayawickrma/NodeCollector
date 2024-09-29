package lk.ijse.nodecollecter.service;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUser(String userId);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO userDTO);
}
