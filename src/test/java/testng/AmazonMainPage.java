package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMainPage {

    WebDriver driver;

    //WebElements
    public By accountAndLists = By.cssSelector("a#nav-link-accountList");
   // WebElement accountAndLists = (WebElement) By.cssSelector("a#nav-link-accountList");

   public String AccountAndListsCss= "a#nav-link-accountList";

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage()
    }
    @AfterTest
    public void tearsDown(){
        driver.quit();
    }
    @Test
    public void TestAmazon(){
        driver.get("https://www.amazon.com");

     //first option
 //       driver.findElement(AccountAndLists).click();

     // second option

           driver.findElement(By.cssSelector(AccountAndListsCss)).click();

    }


}
