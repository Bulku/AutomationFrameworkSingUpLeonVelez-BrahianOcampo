package co.com.udea.certification.automationFramework.stepdefinitions;

import co.com.udea.certification.core.utils.GeneralUtils;
import co.com.udea.certification.web.questions.SignUpQuestions;
import co.com.udea.certification.web.tasks.SignUpTasks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.NoArgsConstructor;
import co.com.udea.certification.core.models.User;

import java.time.LocalDate;

@NoArgsConstructor
public class SignUpStepsDefiniton {
    SignUpTasks signUpTasks = new SignUpTasks();
    SignUpQuestions signUpQuestions = new SignUpQuestions();

    @Then("The sign up page is displayed")
    public void theSignUpPageIsDisplayed() {
        signUpQuestions.verifySignUpPageIsDisplayed();
    }

    @When("I fill the sign up form with valid data")
    public void iFillTheSignUpFormWithValidData() {
        User user = User.randomUser();
        signUpTasks.fillFormWithUser(user);
    }

    @And("I finish the account creation")
    public void iFinishAccountCreation() {
        signUpTasks.finishSignUp();
    }

    @When("I clean the password field and send the form")
    public void cleanPasswordField(){
        signUpTasks.cleanPasswordField();
        signUpTasks.finishSignUp();
    }

    @Then("Password is empty alert is displayed")
    public void passwordIsEmptyAlertIsDisplayed() {
        signUpQuestions.verifyIsEmptyAlertIsDisplayed();
    }

    @And("I clean phone field and fill the field with text")
    public void iCleanPhoneFieldAndFillTheFieldWithText() {
        signUpTasks.cleanPhoneField();
        signUpTasks.fillMobilePhone(GeneralUtils.generateRandomText());
    }

    @Then("Verify phone number is a number")
    public void verifyIfItIsNotANumber() {
        signUpQuestions.verifyPhoneIsANumber();
    }


    @And("I clean zipcode field and fill the field with text")
    public void iCleanZipcodeFieldAndFillTheFieldWithText() {
        signUpTasks.cleanZipCode();
        signUpTasks.fillZipCode(GeneralUtils.generateRandomText());
    }

    @Then("Verify zipcode is a number")
    public void verifyZipcodeIsANumber() {
        signUpQuestions.verifyZipCode();
    }

    @And("I overfill the user name field")
    public void iOverfillTheUserNameField() {
        signUpTasks.cleanUserName();
        signUpTasks.fillName(GeneralUtils.generateRandomTextLarge());
    }


    @Then("The User Name size is less than valid characters")
    public void theUserNameSizeIsLessThanValidCharacters() {
        signUpQuestions.userNameSize();
    }
}
