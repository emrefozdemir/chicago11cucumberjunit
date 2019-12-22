Feature: Testing with multiple data

  @multiple
  Scenario: Testing data
    Given  User goes to Amazon
    And User verifies following search departments
      | Alexa Skills  | 1 |
      | Computer      | 2 |
      | Digital Music | 3 |
      | Courses       | 4 |
      | Baby          | 5 |
    Then User closes the amazon
