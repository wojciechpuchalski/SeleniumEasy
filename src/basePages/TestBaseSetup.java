package basePages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

    private WebDriver driver;

    private static WebDriver initChromeDiver(String appUrl) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appUrl);
        return driver;
    }

//    private static WebDriver initGridChromeDiver(String appUrl) {
//        WebDriverManager.chromedriver().setup();
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        WebDriver driver = new RemoteWebDriver(new URL("https://selenium.lokalnyhub.pl/hub"), capabilities);
//        driver.manage().window().maximize();
//        driver.get(appUrl);
//        return driver;
//    }

    private void setDriver(String browser, String appUrl) throws Exception {
        switch (browser) {
            case "chrome":
                driver = initChromeDiver(appUrl);
                break;
//            case "chromeGrid":
//            driver = initGridChromeDiver(appUrl);
//            break;
        }
    }

    @Parameters({"browser", "appUrl"})
    @BeforeClass
    public void initializeTestBaseSetup(String browser, String appUrl) {
        try {
            setDriver(browser, appUrl);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public WebDriver getDriver() {return driver;}
}
