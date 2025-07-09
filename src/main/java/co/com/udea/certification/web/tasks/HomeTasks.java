package co.com.udea.certification.web.tasks;

import co.com.udea.certification.web.pages.HomePage;

public class HomeTasks extends HomePage {

    public void navigateToLoginPage() {
        getLoginSignUpLink().click();
    }
}
