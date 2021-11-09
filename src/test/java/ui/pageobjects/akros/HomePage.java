package ui.pageobjects.akros;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class HomePage extends BasePage {

    private static final String BASE_URL = "https://www.akros.ch/";

    private final By cookieAcceptButton = By.id("onetrust-accept-btn-handler");
    private final By akrosLogo = By.className("logo");
    private final By searchInput = By.id("s");
    private final By searchButton = By.id("sBtn");

    public boolean isSearchInputVisible() {
        return isElementDisplayed(searchInput);
    }

    public void open() {
        driver.get(BASE_URL);
        waitForElementVisible(akrosLogo);
        acceptCookieDefaultSettings();
    }

    public void acceptCookieDefaultSettings() {
        if (isElementDisplayed(cookieAcceptButton)) {
            clickOnElement(cookieAcceptButton);
            waitForElementVisible(akrosLogo);
        }
    }

    public void searchFor(String searchTerm) {
        clickOnElement(searchInput);
        enterText(searchInput, searchTerm);
        clickOnElement(searchButton);
    }

}
