package ui.pageobjects.bls;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;
import ui.utils.TestUtils;

public class HomePage extends BasePage {

    private static final String URL = "https://www.bls.ch";

    private final By cookieAcceptButton = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection");
    private final By searchInput = By.xpath("//input[@role='search']");

    public void open() {
        driver.get(URL);
    }

    public void acceptCookieDefaultSettings() {
        waitForElementVisible(cookieAcceptButton);
        clickOnElement(cookieAcceptButton);
        TestUtils.sleepSomeSecs();
    }

    public void clickOnSearchField() {
        waitForElementClickable(searchInput);
        clickOnElement(searchInput);
    }

    public void searchFor(String searchTerm) {
        enterText(searchInput, searchTerm);
    }

}
