package tests;

import org.junit.Test;
import utilities.Config;
import utilities.TestBase;

public class LoginTestWithProperties extends TestBase {

    @Test
    public void readPropertyTest() throws InterruptedException {
        driver.get(Config.getProperty("url"));
        //Thread.sleep(3000);
        HomePageWithProperties homePage = new HomePageWithProperties();

        String username = Config.getProperty("username");
        String password = Config.getProperty("password");
        homePage.login(username, password);



    }
}
