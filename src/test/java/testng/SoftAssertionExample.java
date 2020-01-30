package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

    @Test
    public void test1() {
        System.out.println("starting");

        Assert.assertTrue(false);

        System.out.println("done");
    }


    @Test
    public void test2() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("starting");
    }
}