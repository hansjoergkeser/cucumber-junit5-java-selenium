package ui.tests.stepdefinitions.ecosia;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsEcosia {

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
//        assertTrue(new HomePage().isDisplayed(), "Not on ecosia homepage.");
    }

}
