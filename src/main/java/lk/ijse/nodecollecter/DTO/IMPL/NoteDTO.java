package lk.ijse.nodecollecter.DTO.IMPL;



import lk.ijse.nodecollecter.DTO.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.rmi.server.UID;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDTO implements SuperDTO {
    public String noteID;
    public String noteTitle;
    public String noteDesc;
    public String createDate;
    public String priorityLevel;
    public String userId;
}
