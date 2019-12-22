Feature: Single Student API Automation
  @singleStudent
  Scenario: Single Student Attribute Validation
    When users hits single student API with "http://cybertekchicago.com/student/1432"
    Then user tests for required attributes
