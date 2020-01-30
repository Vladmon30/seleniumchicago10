package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Openxcell {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://openxcell.com");
      //  driver.get("http://amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

            //1.go to openxcell.com
            //2.locate "case studies" link
            //3.print out class atribute
            //Expected: mega-menu-link

      //  WebElement cs = driver.findElement(By.linkText("Case Studies"));

       WebElement cs = driver.findElement(By.partialLinkText("Studies"));
        System.out.println(cs.getAttribute("class"));
        System.out.println(cs.getAttribute("href"));
        System.out.println(cs.getText());

       // driver.findElement(By.xpath("Other paragraph"));
       // System.out.println(cs.getText());

        List<WebElement> links = driver.findElements(By.xpath("//body//a[id='whatever']"));
        System.out.println(links.size());

        for(WebElement link : links){
            System.out.println(link.getText());
        }
    }
}
