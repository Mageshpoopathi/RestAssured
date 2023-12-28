package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static pages.BasePage.*;
import static pages.DeleteReq.deleteUser;
import static pages.GetReq.getWithQueryParams;
import static pages.GetReq.getWithRouteParams;
import static pages.PostReq.postWith3Map;
import static pages.UpdateReq.updateUser;

public class mobilePhones {
    @Given("EndPoints for POST operation is {string} and datas are {string}, {string} and {int}")
    public void endpointsForPOSTOperationIsAndDatasAreAnd(String params, String para1, String para2, int para3) {
        postWith3Map(params,para1,para2,para3);
        verifyStatusCode("POST Operation :",params);
        logBodyUrl(params);
    }

    @And("Working with {string} route params is {string} device name")
    public void workingWithRouteParamsIsDeviceName(String params, String route) {
        getWithRouteParams(params,route);
        verifyStatusCode("MobilePhones Route params :",params);
    }

    @Then("Working with {string} query params is {string} is {int}")
    public void workingWithQueryParamsIsIs(String params, String key, int value) {
        getWithQueryParams(params,key,value);
    }

    @Given("EndPoints for Update operation is {string} and datas are {string}, {string}, {int} and route is {int}")
    public void endpointsForUpdateOperationIsAndDatasAreAnd(String params, String para1, String para2, int para3,int id) {
        updateUser(params,para1,para2,para3,id);
    }

    @Given("EndPoints for DELETE operation is {string} and ID is {int}")
    public void endpointsForDELETEOperationIsAndIDIs(String params, int id) {
        deleteUser(params,id);
    }
}
