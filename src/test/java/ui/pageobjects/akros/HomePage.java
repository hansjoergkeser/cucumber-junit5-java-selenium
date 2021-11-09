package ui.pageobjects.akros;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class HomePage extends BasePage {

    private final By selector = By.id("...");

    public boolean isDisplayed() {
        return isElementDisplayed(selector);
    }

    public void open() {
        // TODO
    }

    public void searchFor(String searchTerm) {
        // TODO
    }

    public void clickOnSearchField() {
        // TODO
    }
}
