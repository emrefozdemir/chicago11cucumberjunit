Feature: Testing with multiple data

  @multiple
  Scenario: Testing data
    Given  User goes to Amazon
    And User verifies following search departments
    |Alexa Skills|
    |Computer    |
    |Digital Music|
    |Courses      |
    |Baby         |
    Then User closes the amazon
