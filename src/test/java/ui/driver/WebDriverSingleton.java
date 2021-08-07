package ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriver INSTANCE;

    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICIT_WAIT_TIMEOUT = 3;

    public static WebDriver getInstance() {
        if (INSTANCE == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver_linux64v89/chromedriver");
            INSTANCE = new ChromeDriver();
            INSTANCE.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
            INSTANCE.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        }
        return INSTANCE;
    }

    public static void tearDown() {
        if (INSTANCE != null) {
            System.out.println("Closing browser and terminating session");
            INSTANCE.quit();
        }
    }

}
