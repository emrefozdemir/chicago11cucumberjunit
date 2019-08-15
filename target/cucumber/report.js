$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/hrapp_feature/Database and Front end data validation.feature");
formatter.feature({
  "name": "Hr Application and Database and UI data verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Department data UI and Database verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HRAppDB"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am on DepEmpPage",
  "keyword": "Given "
});
formatter.match({
  "location": "HRApp_Steps.i_am_on_DepEmpPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search for departmentid 10",
  "keyword": "When "
});
formatter.match({
  "location": "HRApp_Steps.i_search_for_departmentid(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I query database with sql \"Select department_name, manager_id, location_id from department where department_id \u003d 10\"",
  "keyword": "And "
});
formatter.match({
  "location": "HRApp_Steps.i_query_database_with_sql(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "UI data and Database data must match",
  "keyword": "Then "
});
formatter.match({
  "location": "HRApp_Steps.ui_data_and_Database_data_must_match()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});