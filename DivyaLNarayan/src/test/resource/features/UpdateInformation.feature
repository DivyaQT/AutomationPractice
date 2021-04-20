Feature: UpdateInformation
    
  Background:
    Given I am on the AutomationPractice website
    
  #TC ID - UpdateInformation#1
  Scenario: Update Personal Information(First Name) in My Account
    When I select an item from the items displayed on the front page
    Then I see the item from front page is added to the cart