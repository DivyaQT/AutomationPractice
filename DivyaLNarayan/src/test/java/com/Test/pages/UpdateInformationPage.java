package com.Test.pages;

import org.openqa.selenium.By;
import com.Test.csv_reader.CSVHelper;
import net.serenitybdd.core.pages.PageObject;

public class UpdateInformationPage extends PageObject{

	/***********************Page element identifiers******************************/
	private By accountName = By.xpath("//a[@class='account']");
	private By myPersonalInformationButton = By.xpath("//a[@title='Information']");
	private By firstNameTextField = By.id("firstname");
	private By currentPassword = By.id("old_passwd");
	private By newPassword = By.id("passwd");
	private By confirmPassword = By.id("confirmation");
	private By saveButton = By.name("submitIdentity");
	private By updateSuccessMessage = By.xpath("//p[@class='alert alert-success']");
	
	PlaceOrderPage placeOrderPage;
	CSVHelper csvHelperPage;

 	/********************************************************************
 	 * Description: Function to click on Account Name Signed into the application
 	 ********************************************************************/
     public void clickAccountName()
     {
    	placeOrderPage.waitForElementToAppear(accountName);
    	element(accountName).click();	
     }
    
  	/********************************************************************
  	 * Description: Function to click on My Personal Information button
  	 ********************************************************************/
     public void clickMyPersonalInformation()
     {
    	placeOrderPage.waitForElementToAppear(myPersonalInformationButton);
    	element(myPersonalInformationButton).click();
     }
     
   	/********************************************************************
   	 * Description: Function to update first name and fill all the required fields
   	 ********************************************************************/
     @SuppressWarnings("static-access")
	 public void updateFirstName()
     {
    	placeOrderPage.waitForElementToAppear(firstNameTextField);
    	element(firstNameTextField).clear();
    	element(firstNameTextField).sendKeys(csvHelperPage.getFirstName());
    	element(currentPassword).sendKeys(csvHelperPage.getCurrentPassword());
    	element(newPassword).sendKeys(csvHelperPage.getNewPassword());
    	element(confirmPassword).sendKeys(csvHelperPage.getConfirmPassword());
    	element(saveButton).click();
     }

   	/********************************************************************
   	 * Description: Function to verify FirstName is updated
   	 ********************************************************************/
     @SuppressWarnings("static-access")
  	 public boolean verifyFirstNameUpdated()
     {
    	placeOrderPage.waitForElementToAppear(updateSuccessMessage);
    	String updatedFirstName = element(accountName).getText();
    	if(updatedFirstName.contains(csvHelperPage.getFirstName())) return true;
    	else return false;
     }
}
