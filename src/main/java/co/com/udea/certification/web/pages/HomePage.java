package co.com.udea.certification.web.pages;

import co.com.udea.certification.core.pages.basePage.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Login')]")
    private WebElement loginSignUpLink;

    @FindBy(xpath = "//section[@id='slider']")
    private WebElement homeSlider;

}
