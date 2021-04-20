package com.Test.steps;

import static org.assertj.core.api.Assertions.assertThat;
import com.Test.pages.PlaceOrderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
		 System.out.println("Test Started");
		 placeOrderPage.open();
     }

	/********************************************************************
	 * Description: Sign In to the application
	 ********************************************************************/
	 @When("^I SignIn to the website$")
	 public void whenISignInToTheWebsite()
	 {
		placeOrderPage.signIn();
	 }
		 
	/********************************************************************
	 * Description: Select T-Shirts Category on Home Page
	 ********************************************************************/
	 @When("^I click on TShirts Category on home page$")
	 public void whenIClickOnTShirtsCategoryOnHomePage()
	 {
		 placeOrderPage.clickTShirts();
	 }
	 
	/********************************************************************
	 * Description: Add a TShirt to Cart
	 ********************************************************************/
	 @When("^I select a TShirt$")
	 public void whenISelectATShirt()
	 {
		placeOrderPage.addTShirtToCart();
	 }	
	 
	/********************************************************************
	 * Description: Click on Proceed to Checkout on the pop up
	 ********************************************************************/
	 @When("^I proceed to checkout$")
	 public void whenIProceedToCheckout()
	 {
		placeOrderPage.clickProceedToCheckout();
	 }
	 
	/********************************************************************
	 * Description: Click on Proceed to Checkout on the Cart Page
	 ********************************************************************/
	 @When("^I click on Proceed to checkout on Cart page$")
	 public void whenIClickOnProceedToCheckoutOnCartPage()
	 {
		placeOrderPage.clickProceedToCheckoutOnCartPage();
	 }
	 
	/********************************************************************
	 * Description: Click on Bank Wire Payment Method
	 ********************************************************************/
	 @When("^I select Bank Wire payment$")
	 public void whenISelectBankWirePayment()
	 {
		placeOrderPage.clickBankWirePayment();
	 }
		 
	/********************************************************************
	 * Description: Click on Confirm my order to place the order
	 ********************************************************************/
	 @When("^I confirm my order$")
	 public void whenIConfirmMyOrder()
	 {
		placeOrderPage.clickConfirmMyOrder();
	 }
	 
	/********************************************************************
	 * Description: Validates the Order Reference Number in Order History
	 ********************************************************************/
	 @Then("^I verify the order placed in Order History$")
	 public void thenIVerifyTheOrderPlacedInOrderHistory()
	 {
		assertThat(placeOrderPage.verifyOrderReferenceNumber()).isTrue();
	 }
}
