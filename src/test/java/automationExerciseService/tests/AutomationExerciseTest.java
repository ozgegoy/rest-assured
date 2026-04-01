package automationExerciseService.tests;

import automationExerciseService.endpoints.AutomationExerciseCreateEndpoints;
import automationExerciseService.endpoints.AutomationExerciseDeleteEndpoints;
import automationExerciseService.endpoints.AutomationExerciseGetEndpoints;
import automationExerciseService.endpoints.AutomationExerciseUpdateEndpoints;
import automationExerciseService.pojos.AccountDto;
import automationExerciseService.testDatas.AccountTestData;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.ResponseAssertions;

public class AutomationExerciseTest {

    @Test(priority = 1)
    void getAllProductsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllProductsList();
        ResponseAssertions.assertResponseOk(response);
    }

    @Test(priority = 2)
    void getAllBrandsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllBrandsList();
        ResponseAssertions.assertResponseOk(response);
    }

    @Test(priority = 3)
    void postSearchProductTest() {
        Response response = AutomationExerciseGetEndpoints.postSearchProduct("jean");
        ResponseAssertions.assertResponseOk(response);
    }

    @Test(priority = 4)
    void postCreateAccount() {
        AccountDto accountDto = AccountTestData.createAccountTestData();
        Response response = AutomationExerciseCreateEndpoints.postCreateAccount(accountDto);
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertMessage(response, "User created!");
    }

    @Test(priority = 5)
    void postVerifyLogin() {
        AccountDto accountDto = AccountTestData.accountCredentials();
        Response response = AutomationExerciseCreateEndpoints.postVerifyLogin(accountDto);
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertMessage(response, "User exists!");
    }

    @Test(priority = 6)
    void getUserDetailByEmail() {
        String email = AccountTestData.createAccountTestData().getEmail();
        Response response = AutomationExerciseGetEndpoints.getUserDetailByEmail(email);
        AccountDto createdAccount = AccountTestData.createAccountTestData();
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertUserDetails(response, createdAccount);
    }

    @Test(priority = 7)
    void putUpdateAccount() {
        AccountDto accountDto = AccountTestData.updateAccountTestData();
        Response response = AutomationExerciseUpdateEndpoints.putUpdateAccount(accountDto);
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertMessage(response, "User updated!");
    }

    @Test(priority = 8)
    void getUserDetailByEmailAfterUpdate() {
        String email = AccountTestData.createAccountTestData().getEmail();
        Response response = AutomationExerciseGetEndpoints.getUserDetailByEmail(email);
        AccountDto updatedAccount = AccountTestData.updateAccountTestData();
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertUserDetails(response, updatedAccount);
    }

    @Test(priority = 9)
    void deleteAccount() {
        AccountDto accountDto = AccountTestData.accountCredentials();
        Response response = AutomationExerciseDeleteEndpoints.deleteAccount(accountDto);
        ResponseAssertions.assertResponseOk(response);
        ResponseAssertions.assertMessage(response, "Account deleted!");
    }
}