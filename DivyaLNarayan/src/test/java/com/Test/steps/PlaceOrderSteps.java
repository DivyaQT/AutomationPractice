package com.Test.steps;

import com.Test.pages.PlaceOrderPage;

import cucumber.api.java.en.Given;
import net.thucydides.core.steps.ScenarioSteps;

public class PlaceOrderSteps extends ScenarioSteps {

	PlaceOrderPage placeOrderPage;
	
	/********************************************************************
	 * Description: Launches the AutomationPractice website
	 ********************************************************************/   
	 @Given("^I am on the AutomationPractice website$")
    public void givenIAmOnTheAutomationPracticeWebsite()
    {
		 placeOrderPage.open();
		 placeOrderPage.waitSeconds(5);
    }


}
