package lk.ijse.nodecollecter.Entity.EntityIMPL;

import lk.ijse.nodecollecter.Entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteEntity implements SuperEntity {
    public String noteID;
    public String noteTitle;
    public String noteDesc;
    public String createDate;
    public String priorityLevel;
    public String user;
}
