package automationExerciseService.endpoints;

import config.ConfigReader;

public class Routes {

    public static String baseUrl = ConfigReader.getProperty("baseUrl");

    public static String getAllProductsList = baseUrl + "productsList";
    public static String getAllBrandsList = baseUrl + "brandsList";
    public static String postSearchProduct = baseUrl + "searchProduct";
    public static String postCreateAccount = baseUrl + "createAccount";
    public static String postVerifyLogin = baseUrl + "verifyLogin";
    public static String getUserDetailByEmail = baseUrl + "getUserDetailByEmail";
    public static String putUpdateAccount = baseUrl + "updateAccount";
    public static String deleteAccount = baseUrl + "deleteAccount";
}
