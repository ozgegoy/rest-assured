package automationExerciseService.testDatas;

import automationExerciseService.pojos.AccountDto;
import utils.Methods;

public class AccountTestData {
    public static int randomNumber = Methods.getRandomNumber(1, 99);

    public static AccountDto createAccountTestData() {
        AccountDto accountDto = new AccountDto();
        accountDto.setName("TestName");
        accountDto.setEmail("emaildeneme@gmail.com");
        accountDto.setPassword("12345");
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

    public static AccountDto verifyLoginTestData() {
        AccountDto accountDto = new AccountDto();
        accountDto.setEmail("emaildeneme@gmail.com");
        accountDto.setPassword("12345");
        return accountDto;
    }

    public static AccountDto updateAccountTestData() {
        AccountDto accountDto = new AccountDto();
        accountDto.setName("UpdatedTestName");
        accountDto.setEmail("emaildeneme@gmail.com");
        accountDto.setPassword("12345");
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

    public static AccountDto deleteAccountTestData() {
        AccountDto accountDto = new AccountDto();
        accountDto.setEmail("emaildeneme@gmail.com");
        accountDto.setPassword("12345");
        return accountDto;
    }
}
