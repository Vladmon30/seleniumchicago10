package com.gapAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GapAutomate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // System.setProperty("WebDriver.chrome.driver","C:\\Users\\Vlad\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1.User should have acces to the http://gap.com webpage
        driver.get("https://Gap.com");
        driver.manage().window().maximize();

        //2.User should have click on 'men' link.
        driver.findElement(By.xpath("//*[@id=\"topNavWrapper\"]/div[2]/ul/li[5]/a")).click();


        //3.User should have click on 'jeans' link
        driver.findElement(By.linkText("Jeans")).click();

        //4.User should have click on 'category' link
        driver.findElement(By.xpath("//*[@id=\"desktop-facet0\"]/div[1]/button/span/span[1]")).click();


        //5.User should have click on 'slim' link
        driver.findElement(By.xpath("//*[@id=\"desktop-facet0\"]/div[2]/div/div/label[2]/div")).click();

        //6.User should be able to enter
        //"Jeans in SlimFit with GapFlex $69.95"

        WebElement slJWithGapFl = driver.findElement(By.xpath("//*[@id='app']/div[3]/div/div/div[3]/div[1]/div/div/div/div[3]/div[1]/div/div"));
        slJWithGapFl.click();

        if (slJWithGapFl.equals("//*[@id='app']/div[3]/div/div/div[3]/div[1]/div/div/div/div[3]/div[1]/div/div")) {
            System.out.println("Verif is passed");

        } else {
            System.out.println("ver failed");
        }
    }
    }



