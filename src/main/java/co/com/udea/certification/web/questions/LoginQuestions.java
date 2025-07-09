package co.com.udea.certification.web.questions;

import io.qameta.allure.Allure;
import org.testng.Assert;
import co.com.udea.certification.web.pages.LoginPage;

public class LoginQuestions extends LoginPage {

    public void verifyLoginPageIsDisplayed() {
        Allure.step("Verify email field is displayed");
        Assert.assertTrue(getEmailLogin().isDisplayed(), "Login page is not displayed");
    }
}

