package automationExerciseService.tests;

import automationExerciseService.endpoints.AutomationExerciseCreateEndpoints;
import automationExerciseService.endpoints.AutomationExerciseGetEndpoints;
import automationExerciseService.pojos.CreateUpdateAccountDto;
import automationExerciseService.testDatas.CreateUpdateAccountTestData;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomationExerciseTest {

    @Test(priority = 1)
    void getAllProductsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllProductsList();
        assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    void getAllBrandsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllBrandsList();
        assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 3)
    void postSearchProductTest() {
        Response response = AutomationExerciseGetEndpoints.postSearchProduct("jean");
        assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 4)
    void postCreateAccount() {
        CreateUpdateAccountDto createUpdateAccountDto = CreateUpdateAccountTestData.createAccountTestData();
        Response response = AutomationExerciseCreateEndpoints.postCreateAccount(createUpdateAccountDto);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("message"), "User created!");
    }
}
