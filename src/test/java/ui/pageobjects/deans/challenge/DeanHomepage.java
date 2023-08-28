package ui.pageobjects.deans.challenge;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class DeanHomepage extends BasePage {

	//	private static final String BASE_URL = "http://localhost:63342/cucumber-junit5-java-selenium/src/main/java/Homepage.html?_ijt=vvs9dhkchu9qvk4eucqcunit22&_ij_reload=RELOAD_ON_SAVE";
	private static final String BASE_URL = "file:///C:/Users/keseha/IdeaProjects/cucumber-junit5-java-selenium/src/main/java/homepage.html";

	private final By dropdownButton = By.className("dropbtn");
	private final By shoppingListEntry = By.id("shopping");
	private final By itemInput = By.id("item");
	private final By quantityInput = By.id("quantity");
	private final By createButton = By.id("create-btn");

	public void open() {
		driver.get(BASE_URL);
		waitForElementVisible(dropdownButton);
	}

	public void clickOnDropdownAndOpenShopping() {
		clickOnElement(dropdownButton);
		waitForElementVisible(shoppingListEntry);
		clickOnElement(shoppingListEntry);
	}

	public void addItemToBasket(String text, String quantity) {
		waitForElementVisible(createButton);
		clickOnElement(itemInput);
		enterText(itemInput, text);
		clickOnElement(quantityInput);
		enterText(quantityInput, quantity);
		clickOnElement(createButton);

	}
}
