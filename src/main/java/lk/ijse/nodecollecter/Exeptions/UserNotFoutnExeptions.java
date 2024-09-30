package lk.ijse.nodecollecter.Exeptions;

public class UserNotFoutnExeptions extends ClassNotFoundException{
    public UserNotFoutnExeptions() {
        super();
    }

    public UserNotFoutnExeptions(String s) {
        super(s);
    }

    public UserNotFoutnExeptions(String s, Throwable ex) {
        super(s, ex);
    }
}
