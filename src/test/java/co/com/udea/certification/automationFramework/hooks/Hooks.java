package co.com.udea.certification.automationFramework.hooks;

import co.com.udea.certification.core.listeners.TestListener;
import co.com.udea.certification.core.pages.basePage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import co.com.udea.certification.core.browser.Browser;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Listeners;

@Slf4j
@Listeners(TestListener.class)
public class Hooks {

    @Before(order = 0)
    public void initDriver() {
        BasePage.setDriver(Browser.createWebDriver());
    }

    @After(order = 0)
    public void closeDriver() {
        BasePage.closeDriver();
    }

}
