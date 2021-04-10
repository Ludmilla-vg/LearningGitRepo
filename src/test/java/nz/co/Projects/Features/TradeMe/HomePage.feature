Feature: Home Page


  Scenario: Trademe home page opens successfully
    Given I enter the url in the address bar of the browser
    Then I verify the search bar is displayed
    When I perform a search on red roses
    Then I verify a listing is returned
