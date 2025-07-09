package co.com.udea.certification.web.utils;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

@UtilityClass
public class WebUtils {
    private static final Faker faker = new Faker();

    public static LocalDate generateDateOfBirth() {
        return LocalDate.now()
                .minusYears(faker.number().numberBetween(18, 70))
                .minusMonths(faker.number().numberBetween(0, 12))
                .minusDays(faker.number().numberBetween(0, 28));
    }

    public static String transformMonthToString(int monthValue) {
        return Month.of(monthValue).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static String generateRandomFirstName() {
        return faker.name().firstName();
    }

    public static String generateRandomLastName() {
        return faker.name().lastName();
    }

    public static String generateRandomCompany() {
        return faker.company().name();
    }

    public static String generateRandomAddress1() {
        return faker.address().streetAddress();
    }

    public static String generateRandomAddress2() {
        return faker.address().secondaryAddress();
    }

    public static String generateRandomMobilePhone() {
        return faker.phoneNumber().cellPhone();
    }

    public static String generateRandomZipCode() {
        return faker.address().zipCode();
    }

    public static String generateRandomCountry() {
        List<String> countries = Arrays.asList("India", "United States", "Canada", "Australia");
        return faker.options().nextElement(countries);
    }


    public static String generateRandomState() {
        return faker.address().state();
    }

    public static String generateRandomCity() {
        return faker.address().city();
    }
}