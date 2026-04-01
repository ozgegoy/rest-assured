package automationExerciseService.testDatas;

import automationExerciseService.pojos.AccountDto;
import config.ConfigReader;
import utils.Methods;

public class AccountTestData {
    private static final int randomNumber = Methods.getRandomNumber(1, 99);
    private static final String EMAIL = ConfigReader.getProperty("email");
    private static final String PASSWORD = ConfigReader.getProperty("password");

    private static AccountDto baseAccountData() {
        AccountDto accountDto = new AccountDto();
        accountDto.setEmail(EMAIL);
        accountDto.setPassword(PASSWORD);
        accountDto.setFirstname("TestFirstName");
        accountDto.setLastname("TestLastName");
        accountDto.setAddress1("TestAddress1");
        accountDto.setCountry("TestCountry");
        accountDto.setState("TestState");
        accountDto.setCity("TestCity");
        accountDto.setZipcode("TestZipcode");
        accountDto.setMobile_number(String.valueOf(randomNumber));
        return accountDto;
    }

    public static AccountDto createAccountTestData() {
        AccountDto accountDto = baseAccountData();
        accountDto.setName("TestName");
        return accountDto;
    }

    public static AccountDto updateAccountTestData() {
        AccountDto accountDto = baseAccountData();
        accountDto.setName("UpdatedTestName");
        return accountDto;
    }

    public static AccountDto accountCredentials() {
        AccountDto accountDto = new AccountDto();
        accountDto.setEmail(EMAIL);
        accountDto.setPassword(PASSWORD);
        return accountDto;
    }
}