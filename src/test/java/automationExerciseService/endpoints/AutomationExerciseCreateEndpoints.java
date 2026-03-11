package automationExerciseService.endpoints;

import automationExerciseService.pojos.AccountDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AutomationExerciseCreateEndpoints {

    public static Response postCreateAccount(AccountDto accountDto) {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("name", accountDto.getName());
        formParams.put("email", accountDto.getEmail());
        formParams.put("password", accountDto.getPassword());
        formParams.put("firstname", accountDto.getFirstname());
        formParams.put("lastname", accountDto.getLastname());
        formParams.put("address1", accountDto.getAddress1());
        formParams.put("country", accountDto.getCountry());
        formParams.put("state", accountDto.getState());
        formParams.put("city", accountDto.getCity());
        formParams.put("zipcode", accountDto.getZipcode());
        formParams.put("mobile_number", accountDto.getMobile_number());

        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(formParams)
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
