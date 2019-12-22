Feature: Email verification for students

  @studentEmail
  Scenario: Student email verification
    When users hits list of students API with "http://cybertekchicago.com/student/all"
    And user verifies each students email address to be valid