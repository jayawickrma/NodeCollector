package lk.ijse.nodecollecter.CustomStatusCode;

import lk.ijse.nodecollecter.DTO.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserStatus implements UserStatus {
    private String statusCode;
    private String statusMessage;
}
