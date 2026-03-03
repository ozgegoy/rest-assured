package automationExerciseService.tests;

import automationExerciseService.endpoints.AutomationExerciseGetEndpoints;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomationExerciseTest {

    @Test
    void getAllProductsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllProductsList();
        assertEquals(response.getStatusCode(), 200);
    }

    @Test
    void getAllBrandsListTest() {
        Response response = AutomationExerciseGetEndpoints.getAllBrandsList();
        assertEquals(response.getStatusCode(), 200);
    }

    @Test
    void postSearchProductTest() {
        Response response = AutomationExerciseGetEndpoints.postSearchProduct("jean");
        assertEquals(response.getStatusCode(), 200);
    }
}
