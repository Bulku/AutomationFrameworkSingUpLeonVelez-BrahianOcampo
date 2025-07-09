package co.com.udea.certification.core.utils;
import java.util.UUID;
import java.util.Random;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GeneralUtils {

    private static final Faker faker = new Faker();

    public static String generateRandomUsername() {
        return faker.name().username();
    }

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }

    public static boolean generateRandomBoolean() {
        return faker.bool().bool();
    }

    public static String generateRandomText(){ return faker.leagueOfLegends().champion();}

    public static String generateRandomTextLarge(){ return faker.lorem().sentence(28);}

    public static boolean isStringLengthLessThan(String input, int maxLength) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.length() < maxLength;
    }
}
