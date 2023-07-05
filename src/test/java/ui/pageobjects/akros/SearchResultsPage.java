package ui.pageobjects.akros;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class SearchResultsPage extends BasePage {

    private final By searchResultsPageTitle2 = By.className("pageInnerWrapper");
    private final By searchResultEntry = By.className("searchWrapper");

    public boolean hasSearchResults() {
        return driver.findElements(searchResultEntry).size() > 0;
    }

    public int countVisibleSearchResults() {
        return driver.findElements(searchResultEntry).size();
    }

    public int parseNumberOfResultsInPageTitle() {
        String title = driver.findElement(searchResultsPageTitle2).getText();
        return Integer.parseInt(title.substring(title.indexOf("(") + 1, title.indexOf(")")));
    }

}
