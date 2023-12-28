package stepDefinitions;

import io.cucumber.java.en.*;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import static pages.BasePage.*;
import static pages.GetReq.*;
import static pages.PostReq.*;

public class login {
    @Given("EndPoints for GET operation is {string}")
    public void endpointsForGETOperationIs(String params) {
        getWithParams(params);
        verifyStatusCode("GET Operation :",params);
        logBodyUrl(params);
    }

    @Given("EndPoints for POST operation is {string} and datas are {string} and {string}")
    public void endpointsForPOSTOperationIsAndDatasAreAnd(String params, String para1, String para2) throws FileNotFoundException, MalformedURLException {
        postWith2Map(params,para1,para2);
        verifyStatusCode("POST Operation :",params);
        logBodyUrl(params);
    }


}
