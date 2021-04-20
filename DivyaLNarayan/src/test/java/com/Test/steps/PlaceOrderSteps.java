package com.Test.steps;

import com.Test.pages.PlaceOrderPage;

import cucumber.api.java.en.Given;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class PlaceOrderSteps extends ScenarioSteps {

	PlaceOrderPage placeOrderPage;
	
	/********************************************************************
	 * Description: Launches the AutomationPractice website
	 ********************************************************************/   
	 @Given("^I am on the Automation Practice website$")
    public void givenIAmOnTheAutomationPracticeWebsite()
    {
		 getDriver().get("http://automationpractice.com");
		 placeOrderPage.waitSeconds(5);
    }


}
