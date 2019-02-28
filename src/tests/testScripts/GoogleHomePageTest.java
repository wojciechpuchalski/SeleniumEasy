package testScripts;

import basePages.TestBaseSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.GoogleHomePage;


public class GoogleHomePageTest extends TestBaseSetup {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PageFactory.initElements(driver, GoogleHomePage.class);
        System.out.println("Test start");
    }

    @Test
//    @Parameters({"url"})
    public void verifyGooglePageTittle() {
//        driver.navigate().to(url);
//        String getTitle = driver.getTitle();
//        Assert.assertEquals(getTitle, "Google");
        GoogleHomePage.search();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}