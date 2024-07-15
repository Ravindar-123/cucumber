Feature: verify manufracturer completely
@PositiveTesting
  Scenario: verify manufracturer with valid data
   Given open browser and get url np
    When user enter valid username np
    And user enter valid password np
    When user click on login button np
    Then it should navigate to home page np
    When user click on catlogLinked
    When user click on manufracturerLink   
    Then it should open manufracturer page
    When user enter valid data of manufracturer
    When user click on searchBtn of manufracturer
    When it should display manufracturer details
      @NegativeTesing  
      Scenario: verify manufracturer with invalid data
   Given open browser and get url np
    When user enter valid username np
    And user enter valid password np
    When user click on login button np
    Then it should navigate to home page np
    When user click on catlogLink
    When user click on manufracturerLink
    Then it should open manufracturer page
    When user enter valid data of manufracturer
    When user click on searchBtn of manufracturer
    When it should display manufracturer details