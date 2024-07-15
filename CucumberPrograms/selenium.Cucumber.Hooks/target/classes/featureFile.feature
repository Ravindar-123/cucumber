Feature: verify loginFunction completely

  Background: checking Background
    Given open browser and get url

  #tags concept
  @Positive
  Scenario: verify loginFunction with valid data
    When user enter valid username
    And user enter valid password
    When user click on login button
    Then it should navigate to home page

  #tags concept
  @Negative
  Scenario: verify loginFuction with invalid data
    When user enter invalid username
    And user enter invalid password
    When user click on login button
    Then it should display invalid username and invalid password

  #parameter concept
  @Positive
  Scenario Outline: verify loginFuction with invalid data
    When user enter "<username>"
    And user entered "<password>"
    When user click on login button
    Then it should display invalid username and invalid password

    Examples: 
      | username | password    |
      | sai      | sai123      |
      | kumar    | kumar123    |
      | student  | password123 |
