package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC08_CreateAccountWithInvalidPassword {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC08_CreateAccountWithInvalidPassword(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		createAccountWithInvalidPassword();
	}
	
	public static void createAccountWithInvalidPassword() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.createAccountForWait(), testReport);
		ActionImplementation.click(CreateNewAccountLocators.createAccount(androidDriver), testReport,"createAccount");
		ActionImplementation.sendKeys(LoginPageLocators.enterYourEmail(androidDriver), ActionImplementation.userID, testReport);
		ActionImplementation.click(CreateNewAccountLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.sendKeys(CreateNewAccountLocators.enterYourPassword(androidDriver), "xyz", testReport);
		ActionImplementation.click(CreateNewAccountLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.click(CreateNewAccountLocators.letsGoButton(androidDriver), testReport,"letsGoButton");
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.invalidPasswordCharWait(), testReport);
		String expectedText = "Password must be at least 6 characters, contain upper and lower case letters and at least 1 number";
		ActionImplementation.verifyTextOfElement(CreateNewAccountLocators.invalidPasswordChar(androidDriver), expectedText, testReport);	
	}
}
