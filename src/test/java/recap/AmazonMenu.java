package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.TestBase;

public class AmazonMenu extends TestBase {

    @Test
    public void AmaxonTitle() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Actions action = new Actions(driver);

        WebElement nav = driver.findElement(By.id("icp-nav-language"));
        action.moveToElement(nav).perform();
        Thread.sleep(3000);
    }

    @Test @Ignore
    public void doubleClick() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
        Actions action = new Actions(driver);
        WebElement fold = driver.findElement(By.id("fold_header"));
        action.doubleClick(fold).perform();
        Thread.sleep(3000);
       WebElement footer = driver.findElement(By.className("footer-into-left"));
        action.moveToElement(footer).perform();
        Thread.sleep(3000);

        }
        @Test @Ignore
    public void dragAndDrop() throws InterruptedException {
            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            Actions actions = new Actions(driver);
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droptarget"));
            actions.dragAndDrop(draggable, target).perform();
            actions.clickAndHold(draggable).moveToElement(target).perform();
            Thread.sleep(3000);
        }
            @Test
            public void fileUpload() throws InterruptedException {
                driver.get("http://the-internet.herokuapp.com/upload");
                WebElement fileUpload = driver.findElement(By.id("file-upload"));
                fileUpload.sendKeys("C:\\Users\\Vlad\\Desktop\\NaturNes_20160806214307.jpg");
                Thread.sleep(3000);
                driver.findElement(By.id("file-submit")).click();
                Thread.sleep(3000);





            }
        }




