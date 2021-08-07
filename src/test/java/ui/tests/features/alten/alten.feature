@ui
Feature: About Alten Switzerland AG information

  Scenario: Let's go to the Alten About page
    Given I opened the alten homepage
    When I click on tab "About" on homepage
    Then I should see web page "About"