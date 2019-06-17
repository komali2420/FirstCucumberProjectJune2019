Feature: automationpractice
Scenario: Mouseover first item in popular list
Given user should be on homepage
And Click on Add to Cart button that appears on mouseover
When transfer control to popup that appears
And verify product added message
Then click on Continue Shopping button in popup
When transfer control to main page
Then close the window