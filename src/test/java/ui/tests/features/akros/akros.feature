Feature: 'Cause we are the best of the best of the best... sir!

  Scenario: Akros search feature
    Given I opened the akros homepage
    When I search for "akros"
    Then I should see search results