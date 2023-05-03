package stepsDefinition.proiectAzimut;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class addToCart {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Open Amazon page")
    public void open_amazon_page() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        sleep(1000);
    }

    @Then("Click All button and select Electronics then Office Electronics")
    public void click_all_button_and_select_electronics_then_office_electronics() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//a[@data-menu-id='5']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Office Electronics']")).click();
        sleep(2000);
    }

    @Then("Search for mini desk vacuum")
    public void search_for_mini_desk_vacuum() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("+mini desk vacuum");
        sleep(2000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        sleep(3000);
    }

    @Then("Select the first 2 products and add them to Add To Cart")
    public void select_the_first_2_products_and_add_them_add_to_cart() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//a[@class='a-link-normal s-no-outline']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//a[@class='a-link-normal s-no-outline']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        sleep(2000);

    }

    @Then("We check the cart")
    public void we_check_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id='sw-gtc']")).click();
        sleep(2000);
    }
}


