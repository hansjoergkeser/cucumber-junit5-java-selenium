package ui.tests.stepdefinitions.akros;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import ui.pageobjects.deans.challenge.DeanHomepage;

public class ChallengeStepDefs {

	private final DeanHomepage homepage = new DeanHomepage();

	@Given("I opened the homepage")
	public void iOpenedTheHompage() {
		homepage.open();
	}

	@Then("I should see and take a screenshot")
	public void assertSth() throws IOException {
		homepage.takeScreenshot();
	}

	@When("I go to shopping")
	public void iGoToShopping() throws InterruptedException {
		homepage.clickOnDropdownAndOpenShopping();
		Thread.sleep(200);
	}

	@When("I add items to my basket")
	public void addItemsToBasket() throws InterruptedException {
		homepage.addItemToBasket("Whisky", "666");
		homepage.addItemToBasket("Aprikosen-Likör", "9");
		homepage.addItemToBasket("Mango-Bier", "2");
		homepage.addItemToBasket("1 Scheibe Toast", "1");
		Thread.sleep(200);
	}
}
