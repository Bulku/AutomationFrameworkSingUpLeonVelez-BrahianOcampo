package co.com.udea.certification.automationFramework.stepdefinitions;

import co.com.udea.certification.web.questions.HomeQuestions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;
import co.com.udea.certification.web.tasks.HomeTasks;
import lombok.NoArgsConstructor;

public class HomeStepsDefinition {

    HomeTasks homeTasks = new HomeTasks();
    HomeQuestions homeQuestions = new HomeQuestions();

    @And("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        homeTasks.navigateToLoginPage();
    }

    @Given("I am in the home page")
    public void iAmInTheHomePage() {
        homeQuestions.verifyHomePageIsDisplayed();
    }
}
