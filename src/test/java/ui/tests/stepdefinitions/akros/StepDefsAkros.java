package ui.tests.stepdefinitions.akros;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.driver.WebDriverSingleton;
import ui.pageobjects.akros.HomePage;
import ui.pageobjects.akros.SearchResultsPage;
import ui.utils.TestUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefsAkros {

    private final HomePage homePage = new HomePage();

    @Given("I opened the akros homepage")
    public void i_opened_the_akros_homepage() {
        homePage.open();
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        assertTrue(homePage.isSearchInputVisible(), "Did not find search input field on homepage.");
        homePage.searchFor(searchTerm);
    }

    @Then("I should see search results")
    public void assertSearchResults() {
        assertTrue(new SearchResultsPage().hasSearchResults(), "Did not find any entry on search result page.");
    }

    @After
    public void tearDown() {
        TestUtils.sleep2Secs();
        WebDriverSingleton.tearDown();
    }

}
