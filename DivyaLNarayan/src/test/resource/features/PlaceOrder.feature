Feature: PlaceOrder
    
  #TC ID - PlaceOrder#1
  Scenario: Placing an order for T-Shirt
  	Given I am on the Automation Practice website
  	When I SignIn to the website
    And I click on TShirts Category on home page
    And I select a TShirt
    And I proceed to checkout
    And I click on Proceed to checkout on Cart page
    And I select Bank Wire payment
    And I confirm my order
    Then I verify the order placed in Order History