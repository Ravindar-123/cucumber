Feature: verify loginFunction of nopcommerce completely

  @PositiveTesting
  Scenario: verify loginFunction for nopcommerece with valid data
    Given open browser and get url np
    When user enter valid username np
    And user enter valid password np
    When user click on login button np
    Then it should navigate to home page np

  @NegativeTesing
  Scenario: verify loginFunction for nopcommerece with invalid data
    Given open browser and get url np
    When user enter invalid username np
    And user enter invalid password np
    When user click on login button np
    Then it should navigate to home page np
