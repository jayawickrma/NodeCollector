package lk.ijse.nodecollecter.Controller;

import lk.ijse.nodecollecter.DTO.IMPL.UserDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import lk.ijse.nodecollecter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(
           @RequestPart("firstName") String firstName,
           @RequestPart("lastName")  String lastName,
           @RequestPart("email") String email,
           @RequestPart("password") String password,
           @RequestPart("profilePic") MultipartFile profilePic
    ){
        //user id generate
        String userId =AppUtill.generateUserID();

        //profile pic convert to Base64
        String base64ProPic = AppUtill.generateProfilePicToBase64(profilePic);
        //todo:Build the Object
        UserDTO BuilduserDTO = new UserDTO();
            BuilduserDTO.setId(userId);
            BuilduserDTO.setFirstName(firstName);
            BuilduserDTO.setLastName(lastName);
            BuilduserDTO.setEmail(email);
            BuilduserDTO.setPassword(password);
            BuilduserDTO.setProfilePic(base64ProPic);

            userService.saveUser(BuilduserDTO);

        return BuilduserDTO;

    }
    @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getSelectedUser(@PathVariable ("userId") String userId){
        return userService.getUser(userId);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{userId}")
    public void deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }


}
