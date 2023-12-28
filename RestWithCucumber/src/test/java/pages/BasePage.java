package pages;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static pages.LoadProperties.getURL;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage{

         static String BASE_URL=getURL();
         String params;
        static Response response=RestAssured.get(BASE_URL);

    public BasePage(String params) {
        this.params =params;
        response=RestAssured.get(BASE_URL+params);
    }
    public static void logBody(String params){
        new BasePage(params);
        System.out.println("Log Body : "+ response.getBody().asString());
    }
    public static void logBodyUrl(String params){
        new BasePage(params);
        System.out.println("Log Body : "+ response.getBody().asString());
    }
    public static void responses(String params){
        new BasePage(params);
        System.out.println("Response is : "+response.asString());
    }
    public static void verifyStatusCode(String text,String params){
        new BasePage(params);
        System.out.println(text);
        System.out.println("Status Code is : "+response.getStatusCode());
    }
    public static void listOfKeys(String keyValue,String params){
        new BasePage(params);
        System.out.println("list of key names : "+response.jsonPath().getString(keyValue).toUpperCase());
    }
    public static void logHeaders(String params){
        new BasePage(params);
        System.out.println("Log headers : "+ response.getHeaders());
    }
    public static  void logCookie(String params){
        new BasePage(params);
        System.out.println("Log Cookie : "+response.getCookies());
    }
    public static void timeTaken(String params){
        new BasePage(params);
        System.out.println("Time taken is : "+response.getTime());
    }


}
