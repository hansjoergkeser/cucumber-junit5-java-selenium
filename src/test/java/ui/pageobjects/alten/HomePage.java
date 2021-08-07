package ui.pageobjects.alten;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

import static org.junit.jupiter.api.Assertions.fail;
import static ui.pageobjects.alten.HomePage.HomePageTabs.ABOUT;

public class HomePage extends BasePage {

    private static final String URL = "https://www.alten.ch";

    private final By cookieDisclaimer = By.id("tarteaucitron");
    private final By cookieAcceptButton = By.id("tarteaucitronPersonalize2");
    private final By searchButton = By.className("search");
    private final By tabHome = By.id("menu-item-63");
    private final By tabAbout = By.id("menu-item-64");

    public void open() {
        driver.get(URL);
    }

    public void acceptCookieDefaultSettings() {
        if (isElementDisplayed(cookieDisclaimer)) {
            clickOnElement(cookieAcceptButton);
        }
    }

    public void clickOnSearchField() {
        clickOnElement(searchButton);
    }

    public void clickOnTab(String tabName) {
        if (ABOUT.getName().equalsIgnoreCase(tabName)) {
            clickOnElement(tabAbout);
        } else {
            fail("Invalid homepage tab name");
        }
    }

    enum HomePageTabs {
        ABOUT("ABOUT");

        private final String tabName;

        HomePageTabs(String key) {
            this.tabName = key;
        }

        String getName() {
            return tabName;
        }
    }

}
