package automationExerciseService.tests;

import automationExerciseService.endpoints.AutomationExerciseCreateEndpoints;
import automationExerciseService.endpoints.AutomationExerciseDeleteEndpoints;
import automationExerciseService.endpoints.AutomationExerciseGetEndpoints;
import automationExerciseService.endpoints.AutomationExerciseUpdateEndpoints;
import automationExerciseService.pojos.AccountDto;
import automationExerciseService.testDatas.AccountTestData;
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
        AccountDto accountDto = AccountTestData.createAccountTestData();
        Response response = AutomationExerciseCreateEndpoints.postCreateAccount(accountDto);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("message"), "User created!");
    }

    @Test(priority = 5)
    void postVerifyLogin() {
        AccountDto accountDto = AccountTestData.verifyLoginTestData();
        Response response = AutomationExerciseCreateEndpoints.postVerifyLogin(accountDto);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("message"), "User exists!");
    }

    @Test(priority = 6)
    void getUserDetailByEmail() {
        String email = AccountTestData.createAccountTestData().getEmail();
        Response response = AutomationExerciseGetEndpoints.getUserDetailByEmail(email);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("user.email"), email);
        assertEquals(response.jsonPath().get("user.name"), AccountTestData.createAccountTestData().getName());
    }

    @Test(priority = 7)
    void putUpdateAccount() {
        AccountDto accountDto = AccountTestData.updateAccountTestData();
        Response response = AutomationExerciseUpdateEndpoints.putUpdateAccount(accountDto);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("message"), "User updated!");
    }

    @Test(priority = 8)
    void getUserDetailByEmailAfterUpdate() {
        String email = AccountTestData.createAccountTestData().getEmail();
        Response response = AutomationExerciseGetEndpoints.getUserDetailByEmail(email);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("user.email"), email);
        assertEquals(response.jsonPath().get("user.name"), AccountTestData.updateAccountTestData().getName());
    }

    @Test(priority = 9)
    void deleteAccount() {
        AccountDto accountDto = AccountTestData.deleteAccountTestData();
        Response response = AutomationExerciseDeleteEndpoints.deleteAccount(accountDto);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("message"), "Account deleted!");
    }
}
