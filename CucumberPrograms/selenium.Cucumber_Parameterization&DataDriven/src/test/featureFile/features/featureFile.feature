Feature: verify loginfunction completely

Scenario Outline: verify loginfunction with valid data
Given open browser and get url 
When user enter "<username>"
And user entered "<password>"
And user click on login button
Then it should navigate to home page

Examples: 
|username|password|
|sai|sai123|
|kumar|kumar123|
|admin@yourstore.com|admin|