package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MultipleTabs {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Thread.sleep(10000);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getTitle());

        String mainHandle = driver.getWindowHandle();

        driver.findElement(By.linkText("Elemental Selenium")).click();
        System.out.println(driver.getTitle());

        List<String> allHandles = new ArrayList<String>(driver.getWindowHandles());

        for (String s : allHandles) {
            if (!s.equals(mainHandle)) {
                driver.switchTo().window(s);
                break;
            }
        }

        //driver.switchTo().window(allHandles.get(2));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.switchTo().window(mainHandle);
        System.out.println(driver.getTitle());
    }
}



