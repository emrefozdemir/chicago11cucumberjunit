@back
Feature: Google title verification
#Gherkin

  Background: Login to Google
    When User is on Google search page

  @googleTitle
  Scenario: Google title verification
    And User searches for apples
    Then User should see apples inside of the title

    @new
  Scenario: Google title verification with preffered data
    And User searches for a word "iphone"
    Then User should see a word "iphone" inside of the title

      @dataType
  Scenario: Google Title Test
    Given User test with words "apple" "pen" "paper"
    Then  User checks numbers 12 and 55
