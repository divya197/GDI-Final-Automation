package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC07_LoginWithExistingAccountWrongPwd {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC07_LoginWithExistingAccountWrongPwd(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		loginWithExistingAccountWrongPwd();
	}
	
	public static void loginWithExistingAccountWrongPwd() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, LoginPageLocators.createAccountForWait(), testReport);
		ActionImplementation.sendKeys(LoginPageLocators.enterYourEmail(androidDriver), "10french@yopmail.com", testReport);
		ActionImplementation.click(LoginPageLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.sendKeys(LoginPageLocators.enterYourPassword(androidDriver), "Qwerty123$", testReport);
		ActionImplementation.click(LoginPageLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
		ActionImplementation.click(LoginPageLocators.letsGoButton(androidDriver), testReport,"letsGoButton");
		String expectedText ="Please enter valid email address and password";
		ActionImplementation.wait(androidDriver, LoginPageLocators.wrongPwdValidationMsgWait(), testReport);
		ActionImplementation.verifyTextOfElement(LoginPageLocators.wrongPwdValidationMsg(androidDriver), expectedText, testReport);
	}
	
}
