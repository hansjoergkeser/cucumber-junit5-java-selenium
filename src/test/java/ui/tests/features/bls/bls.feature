Feature: BLS Ticket Apps

#  TestCaseKey (TM4J/Zephyr Scale):
#  https://support.smartbear.com/zephyr-scale-cloud/docs/test-automation/cucumber-integration.html

  @TestCaseKey=BLS-T123
  Scenario: Enter search term on bls homepage
    Given I opened the bls homepage
    When I click on the search field
    And I enter the search term "Bern"
    Then I should see the search term "Bern" in the search input