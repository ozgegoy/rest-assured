package automationExerciseService.endpoints;

import automationExerciseService.pojos.CreateUpdateAccountDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AutomationExerciseCreateEndpoints {

    public static Response postCreateAccount(CreateUpdateAccountDto createUpdateAccountDto) {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("name", createUpdateAccountDto.getName());
        formParams.put("email", createUpdateAccountDto.getEmail());
        formParams.put("password", createUpdateAccountDto.getPassword());
        formParams.put("firstname", createUpdateAccountDto.getFirstname());
        formParams.put("lastname", createUpdateAccountDto.getLastname());
        formParams.put("address1", createUpdateAccountDto.getAddress1());
        formParams.put("country", createUpdateAccountDto.getCountry());
        formParams.put("state", createUpdateAccountDto.getState());
        formParams.put("city", createUpdateAccountDto.getCity());
        formParams.put("zipcode", createUpdateAccountDto.getZipcode());
        formParams.put("mobile_number", createUpdateAccountDto.getMobile_number());

        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParams(formParams)
                .when()
                .post(Routes.postCreateAccount);
    }
}
