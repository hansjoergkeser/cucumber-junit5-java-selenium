Feature: Akros...

Scenario Outline: Akros in browser "<browser>"
  Given I opened "<browser>"
  When I search for "ecosia"
  Then I should see the ecosia website

  Examples:
    | browser |
    | Chrome  |
    | Firefox |
    | Safari  |