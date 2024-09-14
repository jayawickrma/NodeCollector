package lk.ijse.nodecollecter.Controller;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(
            UserDTO userDTO,
           @RequestPart("firstName") String firstName,
           @RequestPart("lastName")  String lastName,
           @RequestPart("email") String email,
           @RequestPart("password") String password,
           @RequestPart("profilePic")  String profilePic
    ){
        //user id generate
        userDTO.setId(AppUtill.generateUserID());

        //profile pic convert to Base64
        String base64ProPic = AppUtill.generateProfilePicToBase64(profilePic);
        //todo:Build the Object
    }
}
