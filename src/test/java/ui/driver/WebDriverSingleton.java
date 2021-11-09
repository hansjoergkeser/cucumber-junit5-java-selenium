package ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriver INSTANCE;

    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICIT_WAIT_TIMEOUT = 3;

    public static WebDriver getInstance() {
        if (INSTANCE == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver_linux64v89/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security model
            options.addArguments("window-size=1920,1080");

            INSTANCE = new ChromeDriver(options);
            INSTANCE.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIMEOUT));
            INSTANCE.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
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
