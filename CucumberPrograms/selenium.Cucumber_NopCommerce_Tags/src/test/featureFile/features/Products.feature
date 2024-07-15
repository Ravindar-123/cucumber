Feature: verify Products completely
@PositiveTesting
  Scenario: verify products with valid data
    Given open browser and get url np
    When user enter valid username np
    And user enter valid password np
    When user click on login button np
    Then it should navigate to home page np
    When user click on catlogLink
    When user click on ProductsLink
    Then it should display ProductsPage
    When user enter valid data
    When user click on searchBtn
    Then it should display productsdetails
    
       @NegativeTesing 
  Scenario: verify products with invalid data
    Given open browser and get url np
    When user enter valid username np
    And user enter valid password np
    When user click on login button np
    Then it should navigate to home page np
    When user click on catlogLink
    When user click on ProductsLink
    Then it should display ProductsPage
    When user enter valid data
    When user click on searchBtn
    Then it should display productsdetails