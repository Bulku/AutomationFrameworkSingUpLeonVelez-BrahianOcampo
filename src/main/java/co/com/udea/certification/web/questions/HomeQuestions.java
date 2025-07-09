package co.com.udea.certification.web.questions;

import co.com.udea.certification.core.actions.WaitActions;
import io.qameta.allure.Allure;
import org.testng.Assert;
import co.com.udea.certification.web.pages.HomePage;

public class HomeQuestions extends HomePage {

    public void verifyHomePageIsDisplayed(){
        Allure.step("Verify home slider is displayed");
        WaitActions.waitForElementToBeVisible(getHomeSlider(), 2);
        Assert.assertTrue(getHomeSlider().isDisplayed(), "Home page is not displayed");
    }

}
