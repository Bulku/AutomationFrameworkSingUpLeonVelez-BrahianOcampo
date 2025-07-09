package co.com.udea.certification.web.tasks;

import co.com.udea.certification.web.pages.AccountCreatedPage;

public class AccountCreatedTasks extends AccountCreatedPage {

    public void clickContinueButton() {
        getContinueButton().click();
    }

    public String getAccountCreatedTitleText() {
        return getAccountCreatedTitle().getText();
    }
}
