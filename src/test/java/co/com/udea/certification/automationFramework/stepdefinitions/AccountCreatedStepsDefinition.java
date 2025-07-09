package co.com.udea.certification.automationFramework.stepdefinitions;

import co.com.udea.certification.web.questions.AccountCreatedQuestions;
import io.cucumber.java.en.And;
import co.com.udea.certification.web.tasks.AccountCreatedTasks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreatedStepsDefinition {

    AccountCreatedQuestions accountCreatedQuestions = new AccountCreatedQuestions();
    AccountCreatedTasks accountCreatedTasks = new AccountCreatedTasks();

    @Then("The account created page is displayed")
    public void verifyAccountCreatedPageIsDisplayed() {
        accountCreatedQuestions.verifyAccountCreatedPageIsDisplayed();
    }

    @When("I click on the continue button")
    public void theUserClicksOnTheContinueButton() {
        accountCreatedTasks.clickContinueButton();
    }
}
