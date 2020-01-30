package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class OrangeHomePage{

    WebDriver driver;
    public OrangeHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="welcome" )
    public WebElement welcomeAdmin;

    @FindBy(id ="aboutDisplayLink" )
    public WebElement aboutDisplay;

    @FindBy(xpath ="//*[@id='welcome-menu']/ul/li[2]/a" )
    public WebElement logout;

    @FindBy(id = "companyInfo")
    public WebElement companyInfo;

    @FindBy(id = "menu_Perfomance")
    public WebElement perfomance;

    @FindBy(id = "menu_perfomance_Configure")
    public WebElement configure;


    @FindBy(id = "menu_perfomance_searchKpi")
    public WebElement kpis;

    @FindBy(id = "kpi360SearchForm_jobTitleCode")
    public WebElement jobTitledropDown;

}
