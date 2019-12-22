Feature: Title verification for students

  @studentTitle
  Scenario: Student Title Verification
    When users hits list of students API with "http://cybertekchicago.com/student/all"
    And user verifies eachs students title to be at least two letters
