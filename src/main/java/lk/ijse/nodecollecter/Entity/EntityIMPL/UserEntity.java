package lk.ijse.nodecollecter.Entity.EntityIMPL;

import lk.ijse.nodecollecter.Entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity implements SuperEntity {
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String profilePic;
    public String notes;
}
