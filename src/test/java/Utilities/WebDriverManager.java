package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    public static void main(String[] args) {
        new WebDriverManager().testDriverManagerChrome();
        new WebDriverManager().testDriverManagerFirefox();
    }

    public void testDriverManagerChrome() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
    public void testDriverManagerFirefox() {
        io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

// todo: dodać switch case



