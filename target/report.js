$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/eclipseworkspace/FirstCucumberProjectJune2019/src/main/java/Feature/autopractice.feature");
formatter.feature({
  "line": 1,
  "name": "automationpractice",
  "description": "",
  "id": "automationpractice",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Mouseover first item in popular list",
  "description": "",
  "id": "automationpractice;mouseover-first-item-in-popular-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user should be on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on Add to Cart button that appears on mouseover",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "transfer control to popup that appears",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify product added message",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Continue Shopping button in popup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "transfer control to main page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "close the window",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoPracticeTest.user_homepage()"
});
formatter.result({
  "duration": 14402577193,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.addto_cart()"
});
formatter.result({
  "duration": 6245149750,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.switchto_childwindow()"
});
formatter.result({
  "duration": 9192896,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.success_msg()"
});
formatter.result({
  "duration": 1656945496,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.continue_shop()"
});
formatter.result({
  "duration": 112773666,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.moveto_parentwin()"
});
formatter.result({
  "duration": 9836917,
  "status": "passed"
});
formatter.match({
  "location": "AutoPracticeTest.close_win()"
});
formatter.result({
  "duration": 109685705,
  "status": "passed"
});
});