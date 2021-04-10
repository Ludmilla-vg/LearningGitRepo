Feature: Sale Property

  Scenario: Search for a sale property
    Given I navigate to the sale property page
    When I search for a property
      | fieldName | value    |
      | Location  | Auckland |