package automationExerciseService.testDatas;

import automationExerciseService.pojos.CreateUpdateAccountDto;
import utils.Methods;

public class CreateUpdateAccountTestData {
    public static int randomNumber = Methods.getRandomNumber(1,99);

    public static CreateUpdateAccountDto createAccountTestData() {
        CreateUpdateAccountDto createUpdateAccountDto = new CreateUpdateAccountDto();
        createUpdateAccountDto.setName("TestName");
        createUpdateAccountDto.setEmail("emaildeneme@gmail.com");
        createUpdateAccountDto.setPassword("12345");
        createUpdateAccountDto.setFirstname("TestFirstName");
        createUpdateAccountDto.setLastname("TestLastName");
        createUpdateAccountDto.setAddress1("TestAddress1");
        createUpdateAccountDto.setCountry("TestCountry");
        createUpdateAccountDto.setState("TestState");
        createUpdateAccountDto.setCity("TestCity");
        createUpdateAccountDto.setZipcode("TestZipcode");
        createUpdateAccountDto.setMobile_number("TestMobileNumber" + randomNumber);
        return createUpdateAccountDto;
    }

    public static CreateUpdateAccountDto updateAccountTestData() {
        CreateUpdateAccountDto createUpdateAccountDto = new CreateUpdateAccountDto();
        createUpdateAccountDto.setName("UpdatedTestName");
        createUpdateAccountDto.setEmail("emaildeneme@gmail.com");
        createUpdateAccountDto.setPassword("12345");
        createUpdateAccountDto.setFirstname("TestFirstName");
        createUpdateAccountDto.setLastname("TestLastName");
        createUpdateAccountDto.setAddress1("TestAddress1");
        createUpdateAccountDto.setCountry("TestCountry");
        createUpdateAccountDto.setState("TestState");
        createUpdateAccountDto.setCity("TestCity");
        createUpdateAccountDto.setZipcode("TestZipcode");
        createUpdateAccountDto.setMobile_number("TestMobileNumber" + randomNumber);
        return createUpdateAccountDto;
    }
}
