$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PC User1/Desktop/SeleniumFiles/RunWithJenins1/src/main/java/Features/Test.feature");
formatter.feature({
  "line": 1,
  "name": "Google Page Test",
  "description": "",
  "id": "google-page-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Google page Search",
  "description": "",
  "id": "google-page-test;google-page-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Web Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Populate the Search field",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close the Web Page",
  "keyword": "Then "
});
formatter.match({
  "location": "GooglePageTest.open_Web_Page()"
});
formatter.result({
  "duration": 12048343900,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageTest.populate_the_Search_field()"
});
formatter.result({
  "duration": 992050900,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageTest.click_on_the_Search_button()"
});
formatter.result({
  "duration": 1309328900,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageTest.close_the_Web_Page()"
});
formatter.result({
  "duration": 1168575900,
  "status": "passed"
});
});