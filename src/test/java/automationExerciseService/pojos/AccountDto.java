package automationExerciseService.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
    private String name;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String address1;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String mobile_number;
}
