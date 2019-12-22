$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/wikipedia.feature");
formatter.feature({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    },
    {
      "name": "@testReport"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});