package co.com.udea.certification.core.pages.Components;

import co.com.udea.certification.core.pages.basePage.BasePage;
import org.openqa.selenium.support.PageFactory;

public class BaseComponent extends BasePage {

    protected BaseComponent() {
        super();
        PageFactory.initElements(getDriver(), this);
    }
}
