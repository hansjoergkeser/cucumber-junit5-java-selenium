Feature: You can find Alten Switzerland AG via Ecosia search engine

Scenario Outline: Let's search for Alten
  Given I opened "<browser>"
  When I search for "ecosia"
  Then I should see the ecosia website

  Examples:
    | browser |
    | Chrome  |
    | Firefox |
    | Safari  |


