//package stepsDefinition.proiectAzimut;
//
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import static java.lang.Thread.sleep;
//
//public class signIn {
//    private WebDriver driver;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Given("Open Amazon page")
//    public void open_amazon_page() throws InterruptedException {
//        driver.get("https://www.amazon.com/?ref_=nav_custrec_signin");
//        sleep(1000);
//
//    }
//
//    @Then("Click The Sign In Button")
//    public void click_the_sign_in_button() throws InterruptedException {
//        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//        sleep(2000);
//    }
//
//    @Then("Enter email address and Continue")
//    public void enter_email_address_and_continue() throws InterruptedException {
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bogdan.ciprian2587@yahoo.ro");
//        sleep(2000);
//        driver.findElement(By.xpath("//input[@id='continue']")).click();
//        sleep(2000);
//    }
//
//    @Then("Enter password and Sign In")
//    public void enter_password_and_sign_in() throws InterruptedException {
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fba2017");
//        sleep(2000);
//        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//        sleep(5000);
//    }
//}
//
