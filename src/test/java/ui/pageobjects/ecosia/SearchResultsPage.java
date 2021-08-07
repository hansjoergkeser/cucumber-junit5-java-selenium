package ui.pageobjects.ecosia;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class SearchResultsPage extends BasePage {

    private final By selector = By.id("...");

    public boolean isDisplayed() {
        return isElementDisplayed(selector);
    }

}
