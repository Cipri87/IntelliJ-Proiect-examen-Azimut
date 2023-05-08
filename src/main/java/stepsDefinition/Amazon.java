package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static java.lang.Thread.sleep;

public class Amazon {
    //Open Amazon website
    @Given("Open Amazon page")
    public void open_amazon_page() throws InterruptedException {
        WebDriverInitialize.openBrowser("https://www.amazon.com/");
        sleep(2000);
    }

    @Then("Click The Sign In Button")
    public void click_the_sign_in_button() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//span[@id='nav-link-accountList-nav" +
                "-line-1']")).click();
        sleep(2000);
    }

    @Then("Enter email address and Continue")
    public void enter_email_address_and_continue() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(
                "bogdan.ciprian2587@yahoo.ro");
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.id("continue")).click();
        sleep(2000);
    }

    @Then("Enter password and Sign In")
    public void enter_password_and_sign_in() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@type='password']"))
                .sendKeys("fba2017");
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@id='signInSubmit']")).click();
        sleep(5000);
    }

    @Then("Click All button and select Electronics then Office Electronics")
    public void click_all_button_and_select_electronics_then_office_electronics() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//a[@data-menu-id='5']")).click();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//a[normalize-space()='Office " +
                "Electronics']")).click();
        sleep(2000);
    }

    @Then("Search for mini desk vacuum")
    public void search_for_mini_desk_vacuum() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("+mini desk vacuum");
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                .click();
        sleep(3000);
    }

    @Then("Select the first product and Add To Cart")
    public void select_the_first_product_and_add_to_cart() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//div[@class='s-widget-container" +
                " s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS " +
                "widgetId=search-results_1']//a[@class='a-link-normal s-no-outline']")).click();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        sleep(2000);
    }

    @Then("We check the cart")
    public void we_check_the_cart() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//span[@id='sw-gtc']")).click();
        sleep(2000);
    }

    @Then("We modify the quantity")
    public void we_modify_the_quantity() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//span[@id='a-autoid-0']")).click();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//li[@class='a-dropdown-item" +
                " quantity-option']//a[@id='quantity_3']")).click();
        sleep(2000);
    }
    @Then("Access Shop Great Deals now")
    public void access_shop_great_deals_now() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//div[@id='nav-swmslot']" +
                "//a[@id='swm-link']")).click();
        sleep(2000);
    }
    @Then("Check the Prime option")
    public void check_the_prime_option() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//input[@data-csa-c-element-id='filter-" +
                "prime-eligible']")).click();
        sleep(2000);
    }
    @Then("Add Price option $25 to $50")
    public void add_the_price_option_$25_to_$50() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1200).perform();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//a[@data-csa-c-element-id='filter" +
                "-price-25-50']")).click();
        sleep(2000);
    }

    @Then("Add Average Customer Review of 4 stars and up")
    public void add_average_customer_review_of_4_stars_and_up() throws InterruptedException {
        Actions action = new Actions(driver);
        action.scrollByAmount(0, 2000).perform();
        sleep(3000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//a[@data-csa-c-element-id='filter-star-rating-4']")).click();
        sleep(2000);
    }

    @Then("Press button for Next page")
    public void press_button_for_next_page() throws InterruptedException {
        Actions action = new Actions(driver);
        action.scrollByAmount(0, 2000).perform();
        sleep(2000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@class='a-pagination']//a[contains(text(),'Next')]")).click();
        sleep(3000);
    }
}

