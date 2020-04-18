$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/theZebra.feature");
formatter.feature({
  "name": "Zebra end to end testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@zebraEndToEndTesting"
    }
  ]
});
formatter.scenario({
  "name": "getting the quotes from Zebra",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@zebraEndToEndTesting"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user is on Zebra home page",
  "keyword": "When "
});
formatter.match({
  "location": "theZebra_Steps.a_user_is_on_Zebra_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides required data for quote",
  "rows": [
    {
      "cells": [
        "insured",
        "No"
      ]
    },
    {
      "cells": [
        "ownOrrent",
        "I rent"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "theZebra_Steps.userProvidesRequiredDataForQuote(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});