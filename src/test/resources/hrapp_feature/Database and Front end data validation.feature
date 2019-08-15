Feature: Hr Application and Database and UI data verification

  @HRAppDB
  Scenario: Department data UI and Database verification
    Given I am on DepEmpPage
    When I search for departmentid 10
    And I query database with sql "Select department_name, manager_id, location_id from department where department_id = 10"
    Then UI data and Database data must match

