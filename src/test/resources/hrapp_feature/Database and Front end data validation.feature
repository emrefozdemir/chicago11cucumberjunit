@smoke @bh-184
Feature: Hr Application and Database and UI data verification

  Background:
    Given I am on DepEmpPage


  Scenario: Department data UI and Database verification
    When I search for departmentid 20
    And I query database with sql "Select department_name, manager_id, location_id from department where department_id = 20"
    Then UI data and Database data must match


  Scenario Outline: Firstname and lastname search by email-UI vs DB verification
    When I search for email "<email>" to see firstname and lastname
    And I query database with sql "SELECT first_name, last_name FROM employees WHERE email = '<email>'"
    Then UI data and Database data must match
    Examples:
      | email   |
      | JWHALEN |
      | HBAER   |
      | JRUSSEL |

  @HRAppDB
  Scenario Outline: Verify Number of employees for departments-UI vs DB verification
    When I search for department id <departmentID> and get number of employees
    And I query database with sql "SELECT COUNT(*) AS employees_count FROM employees WHERE department_id = <departmentID>"
    Then UI data and Database data must match
    Examples:
      | departmentID |
      | 10           |
      | 20           |
      | 40           |
      | 50           |
      | 60           |










