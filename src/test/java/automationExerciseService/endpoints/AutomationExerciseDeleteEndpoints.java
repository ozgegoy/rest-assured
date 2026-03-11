package automationExerciseService.endpoints;

import automationExerciseService.pojos.AccountDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.AccountRequestMapper;

import static io.restassured.RestAssured.given;

public class AutomationExerciseDeleteEndpoints {

    public static Response deleteAccount(AccountDto accountDto) {
        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(AccountRequestMapper.toCredentialsFormParams(accountDto))
                .when()
                .delete(Routes.deleteAccount);
    }
}