package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static pages.BasePage.*;

public class DeleteReq {
    public static void deleteUser(String params,int route) {
        Response response = given()
                .when()
                .delete(BASE_URL+params+route);
        response.body();
        assertEquals(response.getStatusCode(), 200, "Delete operation failed");
        verifyStatusCode("DELETE Operation is :",params);
        logBodyUrl(params);
    }
}
