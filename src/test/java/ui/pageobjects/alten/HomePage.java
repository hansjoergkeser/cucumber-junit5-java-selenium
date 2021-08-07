package ui.pageobjects.alten;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

import static org.junit.jupiter.api.Assertions.fail;

public class HomePage extends BasePage {

    private static final String URL = "https://www.alten.ch";

    private final By cookieAcceptButton = By.id("tarteaucitronPersonalize2");
    private final By searchButton = By.className("search");

    public void open() {
        driver.get(URL);
    }

    public void acceptCookieDefaultSettings() {
        waitForElementVisible(cookieAcceptButton);
        clickOnElement(cookieAcceptButton);
    }

    public void clickOnSearchField() {
        clickOnElement(searchButton);
    }

    public void clickOnTab(HomePageTab homePageTab) {
        switch (homePageTab) {
            case ABOUT:
                clickOnHomePageTab(homePageTab.getName());
                break;
            case EXPERTISE:
                break;
            default:
                fail("Invalid homepage tab");
                break;
        }
    }

    private void clickOnHomePageTab(String tab) {
        clickOnElement(By.xpath("//a[contains(@href,'alten.ch/#" + tab.toLowerCase() + "')]"));
    }

    public enum HomePageTab {
        ABOUT("ABOUT"),
        EXPERTISE("EXPERTISE");

        private String tabName;

        HomePageTab(String key) {
            this.tabName = key;
        }

        public String getName() {
            return tabName;
        }
    }

}
