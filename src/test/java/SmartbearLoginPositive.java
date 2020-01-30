import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartbearLoginPositive {
    public static void main(String[]args){

        //Smartbear software login TC - positive
        // 1.Open browser
        // 2.Go to websitehttp://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx
        // 3.Verify title equals “Web Orders Login”
        // 4.Enter username“Tester”
        // 5.Enter password“test”
        // 6.Click on Login button
        // 7.Verify title equals “Web Orders”
        // 8. Verify url equals


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");

        // 3.Verify title equals “Web Orders Login”
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders Login")){
            System.out.println("PASSED");
        }else{
            System.out.println("Not PASSED");
        }
        // 4.Enter username“Tester”
       WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        // 5.Enter password“test”
       WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        // 6.Click on Login button
       WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        username.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();



        String url = driver.getCurrentUrl();
        if (url.equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")){
            System.out.println("URL verificaiton PASSED");
        }
        else {
            System.out.println("URL verification FAILED");
        }
    }
}





