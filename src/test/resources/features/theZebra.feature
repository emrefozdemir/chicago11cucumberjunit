@zebraEndToEndTesting
Feature: Zebra end to end testing

  Scenario: getting the quotes from Zebra
    When A user is on Zebra home page
    Then User provides required data for getting quote
      | insured   | No     |
      | ownOrrent | I rent |
