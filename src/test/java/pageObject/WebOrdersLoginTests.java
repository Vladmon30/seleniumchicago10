package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WebOrdersLoginPage;

import java.util.concurrent.TimeUnit;

public class WebOrdersLoginTests {

    WebDriver driver;

    @BeforeClass

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void positiveLoginUsingPOM() {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");

        WebOrdersLoginPage loginPage = new WebOrdersLoginPage(driver);
        loginPage.userName.sendKeys("Admin");
        loginPage.password.sendKeys("admin123");
        loginPage.loginButton.click();
    }
}