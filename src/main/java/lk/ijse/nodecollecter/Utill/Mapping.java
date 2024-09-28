package lk.ijse.nodecollecter.Utill;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.Entity.EntityIMPL.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    public UserEntity toUserEntity(UserDTO userDTO){  //to user maping
        return modelMapper.map(userDTO,UserEntity.class);
    }
    public UserDTO touserDTO(UserEntity userEntity){
        return modelMapper.map(userEntity,UserDTO.class);
    }
}
