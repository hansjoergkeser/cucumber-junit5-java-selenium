package ui.pageobjects.akros;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class HomePage extends BasePage {

    private static final String BASE_URL = "https://www.akros.ch/";

    private final By akrosLogo = By.className("logo");

    //    private final By searchInput = By.className("searchBtnForm");
    private final By searchInput = By.id("s");
    private final By searchButton = By.id("sBtn");

    public boolean isDisplayed() {
        return isElementDisplayed(searchInput);
    }

    public void open() {
        driver.get(BASE_URL);
        waitForElementVisible(akrosLogo);
    }

    public void clickOnSearchField() {
        clickOnElement(searchInput);
    }

    public void searchFor(String searchTerm) {
        clickOnSearchField();
        enterText(searchInput, searchTerm);
        clickOnElement(searchButton);
    }

}
