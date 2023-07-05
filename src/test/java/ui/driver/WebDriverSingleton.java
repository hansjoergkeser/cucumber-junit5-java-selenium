package ui.driver;

import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@Slf4j
public class WebDriverSingleton {

    private static WebDriver INSTANCE;
    private static final long PAGE_LOAD_TIMEOUT = 10;
    private static final long IMPLICIT_WAIT_TIMEOUT = 3;

    public static WebDriver getInstance() {
        if (INSTANCE == null) {
            initFirefoxDriver();

            INSTANCE.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIMEOUT));
            INSTANCE.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        }
        return INSTANCE;
    }

    private static void initChromeDriver() {
        // https://chromedriver.chromium.org/downloads
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_win32v114_16/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("window-size=1920,1080");

        INSTANCE = new ChromeDriver(options);
    }

    private static void initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver-v0.33.0-win32/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();

        INSTANCE = new FirefoxDriver(options);
    }

    public static void tearDown() {
        if (INSTANCE != null) {
            log.info("Closing browser and terminating session");
            INSTANCE.quit();
        }
    }

}
