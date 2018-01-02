package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC54_ChangePasswordLink {
	

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC54_ChangePasswordLink(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		changePasswordLink();
	}
	
	public static void changePasswordLink() throws InterruptedException{
	
	ActionImplementation.verifyPresenceOfElement(ProfilePageLocators.forgotPasswordLink(androidDriver), "forgotPasswordLink", testReport);
	}


}
