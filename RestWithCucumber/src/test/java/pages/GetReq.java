package pages;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static pages.BasePage.BASE_URL;

public class GetReq {
    public static void getWithParams(String params){
        given().contentType(ContentType.JSON).
                when().get(BASE_URL+params);
    }
    public static void getWithRouteParams(String params,String route){
        System.out.println("ROUTE PARAMS DATAS : "+route);
        given().pathParam("route1",route).
                when().get(BASE_URL+params+"/{route1}").
                then().log().body();
    }
    public static void getWithQueryParams(String params,String key,int value){
        System.out.println("QUERY PARAMS DATAS : {"+key+":"+value+"}");
        given().queryParam(key,value).
                when().get(BASE_URL+params).
                then().log().body();
    }


}
