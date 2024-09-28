package lk.ijse.nodecollecter.DTO.IMPL;

import lk.ijse.nodecollecter.DTO.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO implements SuperDTO {
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String profilePic;
    public List<NoteDTO> notes;
}
