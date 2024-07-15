Feature: verify loginFunction completely

Background:  checking background
Given open browser and get url

@Positive
 Scenario: verify loginFunction with valid data
    Given open browser and get url
    When user enter valid username
    And user enter valid password
    When user click on login button
    Then it should navigate to home page

@Negative
  Scenario: verify loginFuction with invalid data
    When user enter invalid username
    And user enter invalid password
    When user click on login button
    Then it should display invalid username and invalid password
