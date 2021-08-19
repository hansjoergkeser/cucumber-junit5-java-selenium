Feature: BLS Ticket Apps

  Scenario: Enter search term on bls homepage
    Given I opened the bls homepage
    When I click on the search field
    And I enter the search term "Bern"
    Then I should see the search term "Bern" in the search input