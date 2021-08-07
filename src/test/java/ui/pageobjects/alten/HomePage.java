package ui.pageobjects.alten;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class HomePage extends BasePage {

    private final By cookieDisclaimer = By.id("tarteaucitron");
    private final By cookieAcceptButton = By.id("tarteaucitronPersonalize2");
    private final By searchButton = By.className("search");

    public void open() {
        driver.get("https://www.alten.ch");
    }

    public boolean isDisplayed() {
        return isElementDisplayed(cookieDisclaimer);
    }

    public void acceptCookieDefaultSettings() {
        clickOnElement(cookieAcceptButton);
    }

}
