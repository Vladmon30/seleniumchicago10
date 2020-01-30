package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class SmartBear extends TestBase {
    //Login to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    //locate table and store into webElement(orderTable)

    // Task: print out each row data line by line in format:
    // row 1data...
    // row 2data...
    // row 3data...


    //Print each row data line by line in folowing format:
    // column1|column2|column3|
    //-------------------------
    // column1|column2|column3|
    //--------------------------
    // column1|column2|column3|
    @Test
    public void orderTables() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

        WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));

        int rowSize = orderTable.findElements(By.tagName("tr")).size();
        System.out.println(rowSize);

        List<WebElement> rows = orderTable.findElements(By.tagName("tr"));
//            for (WebElement row : rows) {
//                List<WebElement> columns = row.findElements(By.tagName("td"));
//                for (WebElement column : columns) {
//                    System.out.print(column.getText() + " | ");
//                }
//                System.out.println();
//                System.out.println("---------------------------");
//            }
//        }
        printData(1, 1);
        printData(4, 1);
        printData(6, 3);
//creates method that prints the data with given coordinates(rowNum, coNums)
    }

    public void printData(int row, int col) {
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + (row + 1) + "]/td[" + (col + 1) + "]";
        WebElement targetElement = driver.findElement(By.xpath(xpath));
        System.out.println(targetElement.getText());
    }
}
