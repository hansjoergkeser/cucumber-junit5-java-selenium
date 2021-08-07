package ui.tests.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pageobjects.ecosia.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefs {

    @Given("I opened {string}")
    public void i_opened(String browser) {
        System.out.println("Chosen browser: " + browser);
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        System.out.println("Search term: " + searchTerm);
    }

    @Then("I should see the ecosia website")
    public void i_should_see_the_ecosia_website() {
        assertTrue(new HomePage().isDisplayed(), "Not on ecosia homepage.");
    }

    @Given("I opened website {string}")
    public void i_opened_web_site(String website) {
        System.out.println("Opening website: " + website);
    }

    @When("I click on tab {string} on homepage")
    public void i_click_on_tab_on_homepage(String tab) {
        System.out.println("Click on tab: " + tab);
    }

    @Then("I should see web page {string}")
    public void iShouldSeeWebPage(String webPageName) {
        System.out.println("Asserting web page: " + webPageName);
        assertTrue(new ui.pageobjects.alten.HomePage().isDisplayed(), "Not on Alten: " + webPageName);
    }

}
