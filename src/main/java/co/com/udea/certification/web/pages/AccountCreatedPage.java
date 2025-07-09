package co.com.udea.certification.web.pages;

import co.com.udea.certification.core.pages.basePage.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AccountCreatedPage extends BasePage {

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    private WebElement accountCreatedTitle;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;
}
