package co.com.udea.certification.core.pages.basePage;

import co.com.udea.certification.core.browser.Browser;
import co.com.udea.certification.core.utils.ConfigReader;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Slf4j
@Getter
public abstract class BasePage {

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    protected BasePage() {
        WebDriver driver = getDriver();
        if (driver == null) {
            driver = Browser.createWebDriver();
            setDriver(driver);
        }
        try {
            PageFactory.initElements(getDriver(), this);
        } catch (Exception e) {
            log.error("Error while initializing page elements: {}", e.getMessage());
        }
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void closeDriver() {
        WebDriver driver = getDriver();
        if(driver != null) {
            driver.quit();
        }
        driverThreadLocal.remove();
    }

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
        ConfigReader configReader = new ConfigReader();
        openPageByUrl(configReader.getUrl());
    }

    public static void openPageByUrl(String url) {
        driverThreadLocal.get().get(url);
    }
}
