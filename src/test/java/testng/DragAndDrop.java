package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class DragAndDrop extends TestBase {

    @Test
    public void test(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        // pass the variable in the correct order, first one is source, second one is target

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

    }


    @Test
    public void test2(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        // write the steps for doing the drag and drop operation
        // without using the dragAndDrop(); method
        // when we use multiple actions we need to add build() before we perform()
        //
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).release().build().perform();



    }

}
