@wiki
Feature: Wikipedia Search Functionality Title Verification

  Scenario Outline:
    Given User is on Wikipedia home page
    When User types "<searchKey>" in the search box
    And User click search button
    Then User sees "<title>" is in the title
    Then user click on submit button
    Examples: Test data for search functionality

      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Lady Gaga    | Lady Gaga    |
      | Lionel Messi | Lionel Messi |





