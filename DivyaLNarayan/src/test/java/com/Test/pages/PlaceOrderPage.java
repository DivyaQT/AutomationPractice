package com.Test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Test.csv_reader.CSVHelper;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")
public class PlaceOrderPage extends PageObject {

	/***********************Page element identifiers******************************/
	private By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By tShirtCategory = By.xpath("(//a[text()='T-shirts'])[2]");
	private By products = By.xpath("//ul[@class='product_list grid row']");
	private By productImage = By.xpath("//div[@class='product-image-container']//img");
	private By addToCartButton = By.xpath("//*[text()='Add to cart']");
	private By proceedToCheckoutButton = By.xpath("//*[contains(text(),'Proceed to checkout')]");
	private By proceedToCheckoutButtonOnCartPage = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
	private By proceedToCheckoutAddressPage = By.name("processAddress");
	private By termsOfServiceCheckBox = By.id("cgv");
	private By proceedToCheckoutShippingPage = By.name("processCarrier");
	private By bankWirePayment = By.xpath("//a[@class='bankwire']");
	private By confirmMyOrderButton = By.xpath("//*[text()='I confirm my order']");
	private By orderReferenceNumber = By.xpath("//div[@class='box']");
	private By accountName = By.xpath("//a[@class='account']");
	private By orderHistoryButton = By.xpath("//a[@title='Orders']");
	private By orderReferenceNumberInOrderHistory = By.xpath("(//a[@class='color-myaccount'])[1]");
	
	CSVHelper csvHelperPage;
	public String orderNumber = null;

	/********************************************************************
	 * Description: Function to SignIn to the application
	 ********************************************************************/
	 @SuppressWarnings("static-access")
	 public void signIn()
     {
    	waitForElementToAppear(signIn);
    	element(signIn).click();
    	element(emailTextField).sendKeys(csvHelperPage.getSignInEmail());
    	element(passwordTextField).sendKeys(csvHelperPage.getSignInPassword());
    	element(signInButton).click(); 	
     }
   
	/********************************************************************
	 * Description: Waits for a element to be loaded on the webpage
	 ********************************************************************/
     public void waitForElementToAppear(By element)
     {
    	WebDriverWait wait = new WebDriverWait(getDriver(),50);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
     }
	
	/********************************************************************
	 * Description: Function to click on TShirts link on home page
	 ********************************************************************/
     public void clickTShirts()
     {
    	waitForElementToAppear(tShirtCategory);
    	element(tShirtCategory).click();
     }
     
 	/********************************************************************
 	 * Description: Function to click Add to Cart for the desired Tshirt
 	 ********************************************************************/
     public void addTShirtToCart()
     {
    	waitForElementToAppear(products);
    	moveTo(productImage);
    	waitForElementToAppear(addToCartButton);
    	element(addToCartButton).click();
     }
    
 	/********************************************************************
 	 * Description: Function to click on Proceed To Checkout button on the popup
 	 ********************************************************************/
     public void clickProceedToCheckout()
     {
    	waitForElementToAppear(proceedToCheckoutButton);
    	element(proceedToCheckoutButton).click();
     }
     
  	/********************************************************************
  	 * Description: Function to click on Proceed To Checkout button on the Cart Page
  	 ********************************************************************/
     public void clickProceedToCheckoutOnCartPage()
     {
    	waitForElementToAppear(proceedToCheckoutButtonOnCartPage);
    	element(proceedToCheckoutButtonOnCartPage).click();
    	waitForElementToAppear(proceedToCheckoutAddressPage);
    	element(proceedToCheckoutAddressPage).click();
    	element(termsOfServiceCheckBox).click();
    	element(proceedToCheckoutShippingPage).click();
     }
     
  	/********************************************************************
  	 * Description: Function to click on Bank Wire Payment Option
  	 ********************************************************************/
     public void clickBankWirePayment()
     {
    	waitForElementToAppear(bankWirePayment);
    	element(bankWirePayment).click();
     }
    
  	/********************************************************************
  	 * Description: Function to click on Confirm My Order button
  	 ********************************************************************/
     public void clickConfirmMyOrder()
     {
    	waitForElementToAppear(confirmMyOrderButton);
    	element(confirmMyOrderButton).click();
    	waitForElementToAppear(orderReferenceNumber);
    	orderNumber = element(orderReferenceNumber).getText();
     }
    
  	/********************************************************************
  	 * Description: Function to verifiy order is placed from Order History
  	 ********************************************************************/
     public boolean verifyOrderReferenceNumber()
     {
    	waitForElementToAppear(accountName);
    	element(accountName).click();
    	waitForElementToAppear(orderHistoryButton);
    	element(orderHistoryButton).click();
    	String orderNumberInOrderHistory = element(orderReferenceNumberInOrderHistory).getText();
    	if(orderNumber.contains(orderNumberInOrderHistory)) return true;
    	else return false;
     }
}
