package pages;

import io.restassured.response.Response;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static pages.BasePage.*;

public class UpdateReq {


        public static void updateUser(String params,String para1,String para2,int para3,int id){
            JSONObject data=new JSONObject();
            data.put("OsName",para1);
            data.put("Name",para2);
            data.put("id",id);
            data.put("Version",para3);
            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(data.toString())
                    .when()
                    .put(BASE_URL+params+id);
            assertEquals(response.getStatusCode(), 200, "Update operation failed");
            response.getBody();
            verifyStatusCode("UPDATE Operation : ",params);
            logBodyUrl(params);
        }
}
