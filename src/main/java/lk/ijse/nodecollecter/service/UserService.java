package lk.ijse.nodecollecter.service;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUser(String UserID);
    void deleteUser(String userID);
    void updateUser(String UserID,UserDTO userDTO);
}
