Feature: MassMutual Exercise 
  Scenario: verify all objectives on mock page
    Given I am on Exercise mock page
    Then verify the values on the screen are greater than 0
    And verify the total balance based on the values listed in the screen
    And verify if the values are formatted with currency
    And verify if right count of values appear on the screen
    And verify if total balance matches sum of the values
   
