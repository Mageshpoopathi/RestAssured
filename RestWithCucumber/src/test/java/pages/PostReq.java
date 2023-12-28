package pages;

import io.restassured.http.ContentType;

import java.io.FileNotFoundException;

import static PostDatas.UserDataForPOST.*;
import static io.restassured.RestAssured.given;

public class PostReq {
    public static  void postWith2Map(String params,String para1,String para2){
        given().contentType(ContentType.JSON).body(dataWithMap(para1,para2)).
                when().post("http://localhost:3000"+params);

    }
    public static  void postWith3Map(String params,String para1,String para2,int para3){
        given().contentType(ContentType.JSON).body(dataWith3Map(para1,para2,para3).toString()).
                when().post("http://localhost:3000"+params);

    }
    public static void postWithJSON(String params){
        given().contentType(ContentType.JSON).body(dataWithJSON().toString()).
                when().post("http://localhost:3000"+params);
    }
    public static void postWithPOJO(String params){
        given().contentType(ContentType.JSON).body(dataWithPOJO()).
                when().post("http://localhost:3000"+params);
    }
    public static void postWithJSONFile(String params) throws FileNotFoundException {
        given().contentType(ContentType.JSON).body(dataWithJSONFile(params).toString()).
                when().post("http://localhost:3000"+params);
    }
}
