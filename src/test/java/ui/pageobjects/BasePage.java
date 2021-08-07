package ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.driver.WebDriverSingleton;

public class BasePage {

    public static final Integer EXPLICIT_WAIT_TIMEOUT = 10;

    protected final WebDriver driver = WebDriverSingleton.getInstance();
    private final WebDriverWait webDriverWait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT);

    protected boolean isElementDisplayed(By selector) {
        return driver.findElement(selector).isDisplayed();
    }

    protected void clickOnElement(By selector) {
        driver.findElement(selector).click();
    }

}
