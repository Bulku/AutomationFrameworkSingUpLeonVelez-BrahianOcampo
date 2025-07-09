package co.com.udea.certification.web.tasks;

import co.com.udea.certification.core.actions.WaitActions;
import co.com.udea.certification.core.utils.GeneralUtils;
import co.com.udea.certification.web.pages.LoginPage;

public class LoginTasks extends LoginPage {

    public void signup() {
        WaitActions.waitForElementToBeClickable(getSignUpButton(), 5);
        getSignUpButton().click();
    }

    public void fillSignUp(){
        WaitActions.waitForElementToBeClickable(getNameSignUp(), 2);
        getNameSignUp().sendKeys("ExampleNameUser");
        WaitActions.waitForElementToBeClickable(getEmailSignUp(), 2);
        getEmailSignUp().sendKeys(GeneralUtils.generateRandomEmail());
    }
}
