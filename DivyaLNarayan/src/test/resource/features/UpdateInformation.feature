Feature: UpdateInformation
    
  #TC ID - UpdateInformation#1
  Scenario: Update Personal Information(First Name) in My Account
  	Given I am on the Automation Practice website
    When I SignIn to the website
    And I click on the account name
    And I click on My Personal Information
    And I enter the details to update my First name
    Then I see First name is updated in My Account