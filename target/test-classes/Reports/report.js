$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/91959/eclipse-workspace/Project730AMSecond/src/test/resources/login.feature");
formatter.feature({
  "name": "Validation of facebook details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Validate the login details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is on facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});