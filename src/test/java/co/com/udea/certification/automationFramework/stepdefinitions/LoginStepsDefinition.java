package co.com.udea.certification.automationFramework.stepdefinitions;

import co.com.udea.certification.web.questions.LoginQuestions;
import co.com.udea.certification.web.tasks.LoginTasks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
    LoginTasks loginTasks = new LoginTasks();
    LoginQuestions loginQuestions = new LoginQuestions();


    @Then("The login page is displayed")
    public void theLoginPageIsDisplayed() {
        loginQuestions.verifyLoginPageIsDisplayed();
    }

    @When("I click on the sign up option")
    public void iClickOnTheSignUpOption() {
        loginTasks.signup();
    }

    @When("I fill name and email fields in the signup form")
    public void iFillNameAndEmailFieldsInTheSignupForm() {
        loginTasks.fillSignUp();
    }



}
