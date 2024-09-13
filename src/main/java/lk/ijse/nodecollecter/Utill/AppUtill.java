package lk.ijse.nodecollecter.Utill;

import java.util.UUID;

public class AppUtill {
    public static String generateNoteID(){
        return "NOTE - " +  UUID.randomUUID();
    }
}
