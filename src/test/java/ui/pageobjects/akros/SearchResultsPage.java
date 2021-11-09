package ui.pageobjects.akros;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class SearchResultsPage extends BasePage {

    private final By searchResultEntry = By.className("searchWrapper");

    public boolean isEmpty() {
        return driver.findElements(searchResultEntry).size() == 0;
    }

    public boolean hasSearchResults() {
        return driver.findElements(searchResultEntry).size() > 0;
    }

}
