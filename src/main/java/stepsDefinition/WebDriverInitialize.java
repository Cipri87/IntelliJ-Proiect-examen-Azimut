package stepsDefinition;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;



public class WebDriverInitialize {

    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call WebDriverFactory.openBrowser() before use this method");
        }
    }
    public static void openBrowser(String pageUrl) {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }
    @After
    public static void closeBrowser(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}