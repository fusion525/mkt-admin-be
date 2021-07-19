package mktadmin.mktadminbe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private long id;
    private String cardNumber;
    private String fullName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int zip;
    private String city;
    private String address;
    private LocalDate birthDate;
    private String birthplace;
    private MemberState memberState;

}
