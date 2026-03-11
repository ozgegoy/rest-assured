package automationExerciseService.endpoints;

import automationExerciseService.pojos.AccountDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.AccountRequestMapper;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AutomationExerciseCreateEndpoints {
    public static Response postCreateAccount(AccountDto accountDto) {
        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(AccountRequestMapper.toAccountFormParams(accountDto))
                .when()
                .post(Routes.postCreateAccount);
    }

    public static Response postVerifyLogin(AccountDto accountDto) {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("email", accountDto.getEmail());
        formParams.put("password", accountDto.getPassword());

        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(formParams)
                .when()
                .post(Routes.postVerifyLogin);
    }
}