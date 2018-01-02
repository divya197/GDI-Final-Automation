package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.ProfilePopUpFieldsLocators;
import com.gdi.locators.landingPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;

public class UC03_CreateNewAccount {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC03_CreateNewAccount(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		createNewAccount();
	}
	
	public static void createNewAccount() throws InterruptedException{
		
		Thread.sleep(7000);
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.accessYourWishlistWait(), testReport);
		ActionImplementation.click(CreateNewAccountLocators.createAccount(androidDriver), testReport,"createAccountTab");
		ActionImplementation.sendKeys(CreateNewAccountLocators.enterYourEmail(androidDriver), ActionImplementation.getUniqueUserName(androidDriver), testReport);
		ActionImplementation.click(CreateNewAccountLocators.accessToYourWishlistStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.sendKeys(CreateNewAccountLocators.enterYourPassword(androidDriver), "Qwerty123$", testReport);
		ActionImplementation.click(CreateNewAccountLocators.accessToYourWishlistStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.click(CreateNewAccountLocators.letsGoButton(androidDriver), testReport,"letsGoButton");
		ActionImplementation.wait( androidDriver,landingPageLocators.letsDoThisWait(), testReport);
		ActionImplementation.click(CreateNewAccountLocators.letsDoThis(androidDriver),testReport,"letsDoThis");
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.findMeWait(), testReport);
		Thread.sleep(8000);
		ActionImplementation.click(CreateNewAccountLocators.findMe(androidDriver),testReport,"findMe");
		Thread.sleep(2000);
		ActionImplementation.click(CreateNewAccountLocators.allow(androidDriver),testReport,"allow");
		Thread.sleep(6000);
        ActionImplementation.wait(androidDriver, CreateNewAccountLocators.completeProfileWait(),testReport);
     	//ActionImplementation.click(CreateNewAccountLocators.closeProfileButton(androidDriver), testReport,"closeProfileButton");
     	Thread.sleep(2000);
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Dynamite
        //ActionImplementation.wait(androidDriver, CreateNewAccountLocators.notifyMeWait(), testReport);
//		ActionImplementation.click(CreateNewAccountLocators.notifyMeButton(androidDriver), testReport);
//		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.useMyLocationWait(), testReport);
//     	ActionImplementation.click(CreateNewAccountLocators.useMyLocationButton(androidDriver), testReport);
//     	ActionImplementation.wait(androidDriver, CreateNewAccountLocators.allowLocationButtonWait(), testReport);
//     	ActionImplementation.click(CreateNewAccountLocators.allowLocationButton(androidDriver), testReport);
     	
     	
	}
}
