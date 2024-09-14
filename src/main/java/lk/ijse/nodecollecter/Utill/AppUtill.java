package lk.ijse.nodecollecter.Utill;

import java.util.Base64;
import java.util.UUID;

public class AppUtill {
    public static String generateNoteID(){
        return "NOTE - " +  UUID.randomUUID();
    }
    public static String generateUserID(){
        return "USER - " +  UUID.randomUUID();
    }
    public static String generateProfilePicToBase64(String profilePic){
        return Base64.getEncoder().encodeToString(profilePic.getBytes());  //converted to base64

    }
}
