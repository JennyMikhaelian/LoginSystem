import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){
        loginInfo.put("James","password123");
        loginInfo.put("Finn","password456");
        loginInfo.put("Jake","password789");
        }

        public HashMap getIDandPasswords(){
        return loginInfo;
        }




}
