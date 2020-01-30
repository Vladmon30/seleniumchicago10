package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Apple {
    @BeforeClass
    public void setup(){
        System.out.println("Setting up the environment in Before class annotation");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("Closing everithing in After class annotation");

    }
   @BeforeMethod
   public void bm(){
       System.out.println("Before each test");
   }

    @Test(priority = 1)
    public void wappleInfo(){ 
        System.out.println("Test 1 here");
    }
    @Test(priority = 2)
    public void appleInfo2(){
        System.out.println("Test 2 here");
    }
    @Test(dependsOnMethods = "wappleInfo")
    public void post(){
        System.out.println("Posting something on my timeline");
    }
}
