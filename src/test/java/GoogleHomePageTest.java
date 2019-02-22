import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleHomePageTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    String appURL = "http://google.com";

    @Test
    public void verifyGooglePageTittle() {
        driver.navigate().to(appURL);
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Google");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}