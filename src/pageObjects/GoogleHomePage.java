package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {
    private static WebDriver driver;

    @FindBy(name = "btnK") private static WebElement weSearchButton;

//    public GoogleHomePage(WebDriver driver) {
//        GoogleHomePage.driver = driver;
//        wait = new WebDriverWait(driver, 30);
//    }
    public static void search() {
        weSearchButton.click();
    }
}
