Feature: You can find Alten Switzerland AG via Ecosia search engine

Scenario: Let's search for Alten
  Given I opened website "Alten"
  When I click on tab "About" on homepage
  Then I should see web page "About"