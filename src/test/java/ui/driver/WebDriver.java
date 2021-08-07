package ui.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {

    protected ChromeDriver driver;
    protected WebDriverWait wait;

    protected WebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver_linux64v89/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10L);
    }

}
