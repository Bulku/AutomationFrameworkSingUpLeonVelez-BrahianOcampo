package co.com.udea.certification.web.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import co.com.udea.certification.core.pages.basePage.BasePage;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement emailLogin;

    @FindBy(css = "input[data-qa='login-password']")
    private WebElement passwordLogin;

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement nameSignUp;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailSignUp;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;

}
