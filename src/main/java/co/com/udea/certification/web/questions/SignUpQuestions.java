package co.com.udea.certification.web.questions;

import co.com.udea.certification.core.actions.WaitActions;
import co.com.udea.certification.core.utils.GeneralUtils;
import co.com.udea.certification.web.pages.SignUpPage;
import io.qameta.allure.Allure;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.time.LocalDate;

public class SignUpQuestions extends SignUpPage {

    public void verifySignUpPageIsDisplayed() {
        Allure.step("Verify email field is displayed");
        WaitActions.waitForElementToBeVisible(getEmailInput(),2);
        Assert.assertTrue(getEmailInput().isDisplayed(), "SignUp page is not displayed");
    }

    public void verifyIsEmptyAlertIsDisplayed() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Boolean isValid = (Boolean) js.executeScript(
                "return document.getElementById('password').checkValidity();"
        );
        Assert.assertNotEquals(isValid, Boolean.TRUE);
    }


    public void verifyPhoneIsANumber() {
        WaitActions.waitForElementToBeVisible(getMobileNumberInput(), 1);
        boolean isOnlyNumbers = getMobileNumberInput().getText().matches("\\d+");
        Assert.assertTrue(isOnlyNumbers);
    }


    public void verifyZipCode() {
        WaitActions.waitForElementToBeVisible(getZipCodeInput(), 1);
        boolean isOnlyNumbers = getZipCodeInput().getText().matches("\\d+");
        Assert.assertTrue(isOnlyNumbers);
    }

    public void userNameSize() {
        WaitActions.waitForElementToBeVisible(getNameInput(), 1);
        Assert.assertTrue(GeneralUtils.isStringLengthLessThan(getNameInput().getText(), 22));
    }


}
