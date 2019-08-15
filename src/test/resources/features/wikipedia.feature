@wikipedia
Feature: Wikipedia Search Functionality Title Verification
  Scenario:

  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the search box
  And User click search button
  Then User sees "Steve Jobs" is in the title