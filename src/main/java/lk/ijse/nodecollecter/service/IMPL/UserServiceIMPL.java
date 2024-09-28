package lk.ijse.nodecollecter.service.IMPL;

import lk.ijse.nodecollecter.DAO.UserDAO;
import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.Entity.EntityIMPL.UserEntity;
import lk.ijse.nodecollecter.service.UserService;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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

