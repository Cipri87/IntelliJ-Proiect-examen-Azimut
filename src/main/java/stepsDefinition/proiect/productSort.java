package stepsDefinition.proiect;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class productSort {

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

    @Given("Open Amazon main page")
    public void open_amazon_main_page() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        sleep(1000);
    }

    @Then("Access Shop Great Deals now")
    public void access_shop_great_deals_now() throws InterruptedException {
        driver.findElement(By.xpath("//img[contains(@src,'Deals')]")).click();
        sleep(2000);
    }

    @Then("Check the Prime option")
    public void check_the_prime_option() throws InterruptedException {
        driver.findElement(By.xpath("//input[@data-csa-c-element-id='filter-prime-eligible']")).click();
        sleep(2000);
    }

    @Then("Add Price option $25 to $50")
    public void add_the_price_option_$25_to_$50() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1200).perform();
        sleep(2000);
        driver.findElement(By.xpath("//a[@data-csa-c-element-id='filter-price-25-50']")).click();
        sleep(2000);
    }

    @Then("Add Average Customer Review of 4 stars and up")
    public void add_average_customer_review_of_4_stars_and_up() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 500).perform();
        sleep(3000);
        driver.findElement(By.xpath("//a[@data-csa-c-element-id='filter-star-rating-4']")).click();
        sleep(2000);
    }

    @Then("Press button for Next page")
    public void press_button_for_next_page() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 2000).perform();
        sleep(2000);
        driver.findElement(By.xpath("//*[@class='a-pagination']//a[contains(text(),'Next')]")).click();
            sleep(3000);
        }
    }

