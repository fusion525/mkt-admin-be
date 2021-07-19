package mktadmin.mktadminbe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NMMKTCARD")
    private String cardNumber;
    @Column(name = "STFULLNAME")
    private String fullName;
    @Column(name = "STFIRSTNAME")
    private String firstName;
    @Column(name = "STLASTNAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TEL1")
    private String phoneNumber;
    @Column(name = "ZIP1")
    private int zip;
    @Column(name = "STCITY1")
    private String city;
    @Column(name = "STADDRESS1")
    private String address;
    @Column(name = "DTBIRTH", columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(name = "STBIRTHPLACE")
    private String birthplace;
    @Enumerated(EnumType.STRING)
    @Column(name = "STMEMBSTATE")
    private MemberState memberState;

    public Member(String fullName, String firstName, String lastName, String email, String phoneNumber, int zip, String city, String address, LocalDate birthDate, String birthplace, MemberState memberState) {

        this.cardNumber = "A2105";
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
        this.city = city;
        this.address = address;
        this.birthDate = birthDate;
        this.birthplace = birthplace;
        this.memberState = memberState;
    }

}
