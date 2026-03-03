package automationExerciseService.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AutomationExerciseGetEndpoints {

    public static Response getAllProductsList() {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.getAllProductsList);
    }

    public static Response getAllBrandsList() {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.getAllBrandsList);
    }

    public static Response postSearchProduct(String productName) {
        return given()
                .contentType(ContentType.URLENC)
                .accept(ContentType.JSON)
                .formParam("search_product", productName)
                .when()
                .post(Routes.postSearchProduct);
    }
}
