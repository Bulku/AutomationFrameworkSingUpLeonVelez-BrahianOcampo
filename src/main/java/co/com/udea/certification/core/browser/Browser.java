package co.com.udea.certification.core.browser;

import co.com.udea.certification.core.utils.ConfigReader;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


@UtilityClass
public class Browser {

    @SneakyThrows
    public static WebDriver createWebDriver() {
        ConfigReader configReader = new ConfigReader();
        String browser = "chrome";
        return createDriver(configReader.getBrowser());
    }

    private static WebDriver createDriver(String browser) {
        return createDriverByBrowserName(browser);
    }

    public static WebDriver createDriverByBrowserName(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            return createChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            return createFirefoxDriver();
        } else {
            return createEdgeDriver();
        }
    }

    public static WebDriver createChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        return new ChromeDriver(options);
    }

    public static WebDriver createFirefoxDriver(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        return new FirefoxDriver(options);
    }

    private static WebDriver createEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--incognito");
        return new EdgeDriver(options);
    }
}
