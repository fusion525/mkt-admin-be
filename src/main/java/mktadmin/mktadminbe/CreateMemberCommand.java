package mktadmin.mktadminbe;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
public class CreateMemberCommand {

    @NotBlank(message = "Firstname can not be blank")
    private String firstName;
    @NotBlank(message = "Lastname can not be blank")
    private String lastName;
    @NotBlank(message = "Email can not be blank")
    @Email
    private String email;
    //@Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$", message = "Phone number is not valid")
    private String phoneNumber;
    //@Pattern(regexp = "^[0-9]*$", message = "Zip field can only contains numbers")
    private int zip;
    private String city;
    private String address;
    @Past(message = "Birthdate is not valid")
    private LocalDate birthDate;
    private String birthplace;
    @isValidMemberState
    private MemberState memberState;
}
