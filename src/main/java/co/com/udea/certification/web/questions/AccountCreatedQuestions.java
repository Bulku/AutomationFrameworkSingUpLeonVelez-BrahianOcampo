package co.com.udea.certification.web.questions;

import co.com.udea.certification.core.actions.WaitActions;
import co.com.udea.certification.web.pages.AccountCreatedPage;
import io.qameta.allure.Allure;
import org.testng.Assert;

public class AccountCreatedQuestions extends AccountCreatedPage {

    public void verifyAccountCreatedPageIsDisplayed(){
        Allure.step("Verify Account Created title is displayed");
        WaitActions.waitForElementToBeVisible(getAccountCreatedTitle(), 1);
        Assert.assertTrue(getAccountCreatedTitle().isDisplayed(), "Account Created title is not displayed");
        Allure.step("Verify Continue button is displayed");
        WaitActions.waitForElementToBeVisible(getContinueButton(), 1);
        Assert.assertTrue(getContinueButton().isDisplayed(), "Continue button is not displayed");
    }

}
