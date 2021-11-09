package ui.tests.stepdefinitions.akros;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.driver.WebDriverSingleton;
import ui.pageobjects.akros.HomePage;
import ui.utils.TestUtils;

public class StepDefsAkros {

    private final HomePage homePage = new HomePage();

    @Given("I opened the akros homepage")
    public void i_opened_the_akros_homepage() {
        homePage.open();
    }

    @When("I click on the search field")
    public void i_click_on_the_search_field() {
        homePage.clickOnSearchField();
    }

    @When("I enter the search term {string}")
    public void i_enter_the_search_term(String string) {
        homePage.searchFor(string);
    }

    @Then("I should see the search term {string} in the search input")
    public void i_should_see_the_search_term_in_the_search_input(String string) {
        // get text and compare
    }

    @After
    public void tearDown() {
        TestUtils.sleep2Secs();
        WebDriverSingleton.tearDown();
    }

}
