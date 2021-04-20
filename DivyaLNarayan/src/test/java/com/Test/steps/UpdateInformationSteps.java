package com.Test.steps;

import static org.assertj.core.api.Assertions.assertThat;
import com.Test.pages.UpdateInformationPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class UpdateInformationSteps extends ScenarioSteps {

	UpdateInformationPage updateInformationPage;
	
	/********************************************************************
	 * Description: Clicks on the Account Name Signed In on the home page
	 ********************************************************************/
	 @When("^I click on the account name$")
	 public void whenIClickOnTheAccountName()
	 {
		 updateInformationPage.clickAccountName();
	 }
	
	/********************************************************************
	 * Description: Clicks on My Personal Information button
	 ********************************************************************/
	 @When("^I click on My Personal Information$")
	 public void whenIClickOnMyPersonalInformation()
	 {
		 updateInformationPage.clickMyPersonalInformation();
	 }
	 
	/********************************************************************
	 * Description: Enter all the required details to update First Name
	 ********************************************************************/
	 @When("^I enter the details to update my First name$")
	 public void whenIEnterTheDetailsToUpdateMyFirstName()
	 {
		updateInformationPage.updateFirstName();
	 }
	 
	/********************************************************************
	 * Description: Validates First Name is updated
	 ********************************************************************/
	 @Then("^I see First name is updated in My Account$")
	 public void thenISeeFirstNameIsUpdatedInMyAccount()
	 {
		assertThat(updateInformationPage.verifyFirstNameUpdated()).isTrue();
	 }
}
