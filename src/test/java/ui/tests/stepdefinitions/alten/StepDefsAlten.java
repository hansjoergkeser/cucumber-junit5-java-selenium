package ui.tests.stepdefinitions.alten;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.driver.WebDriverSingleton;
import ui.pageobjects.alten.AboutPage;
import ui.pageobjects.alten.HomePage;
import ui.utils.TestUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class StepDefsAlten {

    private final HomePage homePage = new HomePage();

    @Given("I opened the alten homepage")
    public void i_opened_web_site() {
        homePage.open();
        homePage.acceptCookieDefaultSettings();
    }

    @When("I click on tab {string} on homepage")
    public void i_click_on_tab_on_homepage(String tabName) {
        try {
            homePage.clickOnTab(HomePage.HomePageTab.valueOf(tabName.toUpperCase()));
        } catch (IllegalArgumentException i) {
            fail("Homepage tab does not exist: " + tabName);
        }
    }

    @Then("I should see web page {string}")
    public void iShouldSeeWebPage(String webPageName) {
        assertTrue(new AboutPage().isDisplayed(), "Not on Alten: " + webPageName);
    }

    @After
    public void tearDown() {
        TestUtils.sleepSomeSecs();
        WebDriverSingleton.tearDown();
    }

}
