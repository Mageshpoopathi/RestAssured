package PostDatas;

import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class UserDataForPOST {
    public static HashMap<String, String> dataWithMap(String username,String password){
        HashMap<String, String> data=new HashMap<>();
        data.put("USERNAME",username);
        data.put("PASSWORD",password);
        return data;
    }
    public static JSONObject dataWith3Map(String OsName,String Name,int version){
        JSONObject data=new JSONObject();
        data.put("OsName",OsName);
        data.put("Name",Name);
        data.put("id",4);
        data.put("Version", version);
        return data;
    }
    public static JSONObject dataWithJSON(){
        JSONObject data=new JSONObject();
        data.put("USERNAME","Siva");
        String[] password={"lion@208","siva@208"};
        data.put("PASSWORD",password);
        return data;
    }
    public static LoginPOJO dataWithPOJO(){
        LoginPOJO data=new LoginPOJO();
        data.setUSERNAME("sundar");
        data.setPASSWORD("SKM");
        return data;
    }
    public static JSONObject dataWithJSONFile(String params) throws FileNotFoundException {
        File file=new File(".\\data.json");
        FileReader read=new FileReader(file);
        JSONTokener JT=new JSONTokener(read);
        JSONObject data;
        data = new JSONObject(JT);
        return data;
    }
}
