package ui.tests.stepdefinitions.alten;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.driver.WebDriverSingleton;
import ui.pageobjects.alten.AboutPage;
import ui.pageobjects.alten.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefsAlten {

    private final HomePage homePage = new HomePage();

    @Given("I opened the alten homepage")
    public void i_opened_web_site() {
        homePage.open();
        homePage.acceptCookieDefaultSettings();
    }

    @When("I click on tab {string} on homepage")
    public void i_click_on_tab_on_homepage(String tabName) {
        homePage.clickOnTab(tabName);
    }

    @Then("I should see web page {string}")
    public void iShouldSeeWebPage(String webPageName) {
        System.out.println("Asserting web page: " + webPageName);
        assertTrue(new AboutPage().isDisplayed(), "Not on Alten: " + webPageName);
    }

    // junit5 @After doesn't work, using cucumber-junit-platform-engine instead
    @After("@ui")
    public void tearDown() {
        WebDriverSingleton.tearDown();
    }

}
