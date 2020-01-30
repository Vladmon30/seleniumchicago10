package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class EtsyWithSoftAssert extends TestBase {

    @Test
    public void test() {
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("gift" + Keys.ENTER);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("gift"), "title did not match");

        Assert.assertTrue(driver.getTitle().contains("AAA"));



    }
}
