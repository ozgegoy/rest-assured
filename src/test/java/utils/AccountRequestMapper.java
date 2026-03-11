package utils;

import automationExerciseService.pojos.AccountDto;

import java.util.HashMap;
import java.util.Map;

public final class AccountRequestMapper {

    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String ADDRESS1 = "address1";
    private static final String COUNTRY = "country";
    private static final String STATE = "state";
    private static final String CITY = "city";
    private static final String ZIPCODE = "zipcode";
    private static final String MOBILE_NUMBER = "mobile_number";

    private AccountRequestMapper() {
    }

    public static Map<String, Object> toAccountFormParams(AccountDto accountDto) {

        Map<String, Object> formParams = new HashMap<>(11);

        formParams.put(NAME, accountDto.getName());
        formParams.put(EMAIL, accountDto.getEmail());
        formParams.put(PASSWORD, accountDto.getPassword());
        formParams.put(FIRSTNAME, accountDto.getFirstname());
        formParams.put(LASTNAME, accountDto.getLastname());
        formParams.put(ADDRESS1, accountDto.getAddress1());
        formParams.put(COUNTRY, accountDto.getCountry());
        formParams.put(STATE, accountDto.getState());
        formParams.put(CITY, accountDto.getCity());
        formParams.put(ZIPCODE, accountDto.getZipcode());
        formParams.put(MOBILE_NUMBER, accountDto.getMobile_number());

        return formParams;
    }

    public static Map<String, Object> toCredentialsFormParams(AccountDto accountDto) {

        Map<String, Object> formParams = new HashMap<>(2);

        formParams.put(EMAIL, accountDto.getEmail());
        formParams.put(PASSWORD, accountDto.getPassword());

        return formParams;
    }
}