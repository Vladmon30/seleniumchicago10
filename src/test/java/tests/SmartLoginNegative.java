package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartLoginNegative {

   // Smartbear software login TC - negative
    // 1.Open browser
    // 2.Go to website http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx
    // 3.Enter username “Tester”
    // 5.Leave password empty
    // 6.Click on Login button
    // 7.Verify error message “Invalid Login or Password.”




    public static void main(String[] args) {

        // 1.Open browser
        // 2.Go to website http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");


        // 3.Enter username “Tester”
        // 5.Leave password empty
        // 6.Click on Login button
        negativeLogin(driver, "Tester", "");
        negativeLogin(driver, "test", "");
        negativeLogin(driver, "", "");
        negativeLogin(driver, "", "test");
        negativeLogin(driver, "Tester", "james bond");

//        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
//        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
//        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
//        username.sendKeys("Tester");
//        password.sendKeys("");
//        loginBtn.click();
//        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
//        if(errorMessage.getText().equals("Invalid Login or Password.")){
//            System.out.println("Error message verification PASSED");
//        }
//        else{
//            System.out.println("Error message verification FAILED");
//        }
    }




    //TASK: Create void method negativeLogin that takes
// WebDriver object(driver), String username(username), String password(password).
// This method should verify failed login error message “Invalid Login or Password.
// ” When trying to login with given credentials.


    public static void negativeLogin(WebDriver driver, String usernameValue, String passwordValue){
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        username.clear();
        username.sendKeys(usernameValue);
        password.clear();
        password.sendKeys(passwordValue);
        loginBtn.click();

        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
        if(errorMessage.getText().equals("Invalid Login or Password.")){
            System.out.println("Error message verification PASSED");
        }
        else{
            System.out.println("Error message verification FAILED");
        }

//        driver.findElement(By.linkText("Order")).click();
//        WebElement product = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
//        Select productDropDown = new Select(product);
//        productDropDown.selectByValue("FamilyAlbum");

    }
}