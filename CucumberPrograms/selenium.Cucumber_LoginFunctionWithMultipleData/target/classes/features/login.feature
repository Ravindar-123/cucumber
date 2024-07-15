Feature: verify loginFunction completely

  Scenario: verify loginFunction with valid data
    Given open browser and get url
    When user enter valid username
    And user enter valid password
    When user click on login button
    Then it should navigate to home page

  Scenario: verify loginFuction with invalid data
    Given open browser and get url
    When user enter invalid username
    And user enter invalid password
    When user click on login button
    Then it should display invalid username and invalid password

  Scenario: verify loginFunction with valid username and invalid password
    When open browser and get url
    When user enter valid username
    And user enter invalid password
    When user click on login button
    Then it should display invalid password

  Scenario: verify loginFunction with invalid username and valid password
    Given open browser and get url
    When user enter invalid username
    And user enter valid password
    When user click on login button
    Then it should display invalid username

  Scenario: verify loginFunction with empty data
    Given open browser and get url
    When user left username without entering
    And user left password without entering
    When user click on login button
    Then it should display data requried in username and password
