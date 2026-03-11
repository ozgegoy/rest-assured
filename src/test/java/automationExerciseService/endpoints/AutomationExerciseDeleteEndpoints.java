package automationExerciseService.endpoints;

import automationExerciseService.pojos.AccountDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AutomationExerciseDeleteEndpoints {

    public static Response deleteAccount(AccountDto accountDto) {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("email", accountDto.getEmail());
        formParams.put("password", accountDto.getPassword());

        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(formParams)
                .when()
                .delete(Routes.deleteAccount);
    }
}
