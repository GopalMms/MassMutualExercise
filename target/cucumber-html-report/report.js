$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featuresFiles/HomePage.feature");
formatter.feature({
  "name": "MassMutual Exercise",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify all objectives on mock page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on Exercise mock page",
  "keyword": "Given "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.i_am_on_Exercise_mock_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the values on the screen are greater than 0",
  "keyword": "Then "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.verify_the_values_on_the_screen_are_greater_than(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the total balance based on the values listed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.verify_the_total_balance_based_on_the_values_listed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the values are formatted with currency",
  "keyword": "And "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.verify_if_the_values_are_formatted_with_currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if right count of values appear on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.verify_if_right_count_of_values_appear_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if total balance matches sum of the values",
  "keyword": "And "
});
formatter.match({
  "location": "massMutual.gui.stepDefinitions.HomePageStepDefinitions.verify_if_total_balance_matches_sum_of_thevalues()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});