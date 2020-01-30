package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testPopups {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void worningAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        Thread.sleep(1000);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
    }

    @Test

    public void confirmationAlert() throws InterruptedException {


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        Thread.sleep(1000);
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();
    }


    @Test

    public void promptAlert() throws InterruptedException {


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        Alert thirdAlert = driver.switchTo().alert();
        thirdAlert.sendKeys("This is test");
        Thread.sleep(2000);
        thirdAlert.accept();
    }
}
