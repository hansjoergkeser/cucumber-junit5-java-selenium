package ui.tests.stepdefinitions.alten;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefsAlten {

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
