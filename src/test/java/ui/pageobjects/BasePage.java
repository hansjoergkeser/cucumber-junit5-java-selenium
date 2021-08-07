package ui.pageobjects;

import org.openqa.selenium.By;
import ui.driver.WebDriver;

public class BasePage extends WebDriver {

    protected boolean isElementDisplayed(By selector) {
        return driver.findElement(selector).isDisplayed();
    }

    protected void clickOnElement(By selector) {
        driver.findElement(selector).click();
    }

}
