package utils;

import automationExerciseService.pojos.AccountDto;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ResponseAssertions {
    public static void assertResponseOk(Response response) {
        assertEquals(response.getStatusCode(), 200, "Expected status code 200");
    }

    public static void assertMessage(Response response, String expectedMessage) {
        assertEquals(response.jsonPath().get("message"), expectedMessage, "Message mismatch");
    }

    public static void assertUserDetails(Response response, AccountDto account) {
        assertEquals(response.jsonPath().get("user.email"), account.getEmail(), "Email mismatch");
        assertEquals(response.jsonPath().get("user.name"), account.getName(), "Name mismatch");
    }
}