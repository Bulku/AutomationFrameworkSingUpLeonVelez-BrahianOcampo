package co.com.udea.certification.core.models;

import co.com.udea.certification.core.utils.GeneralUtils;
import co.com.udea.certification.web.utils.WebUtils;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
public class User {
    private String signupName;
    private String signupEmail;
    private String title;
    private String name;
    private String password;
    private LocalDate birthDate;
    private boolean newsletter;
    private boolean receiveOffers;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String mobileNumber;


    public static User randomUser() {
        return User.builder()
                .signupName(GeneralUtils.generateRandomUsername())
                .signupEmail(GeneralUtils.generateRandomEmail())
                .title(GeneralUtils.generateRandomBoolean() ? "Mr" : "Mrs")
                .name(GeneralUtils.generateRandomUsername())
                .password(GeneralUtils.generatePassword())
                .birthDate(WebUtils.generateDateOfBirth())
                .newsletter(GeneralUtils.generateRandomBoolean())
                .receiveOffers(GeneralUtils.generateRandomBoolean())
                .firstName(WebUtils.generateRandomFirstName())
                .lastName(WebUtils.generateRandomLastName())
                .company(WebUtils.generateRandomCompany())
                .address1(WebUtils.generateRandomAddress1())
                .address2(WebUtils.generateRandomAddress2())
                .country(WebUtils.generateRandomCountry())
                .state(WebUtils.generateRandomState())
                .city(WebUtils.generateRandomCity())
                .zipCode(WebUtils.generateRandomZipCode())
                .mobileNumber(WebUtils.generateRandomMobilePhone())
                .build();
    }
}