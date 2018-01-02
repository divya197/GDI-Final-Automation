package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC53_GetPhoneNumber {
	

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC53_GetPhoneNumber(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		getPhoneNumber();
	}
	
	public static void getPhoneNumber() throws InterruptedException{
	
	ActionImplementation.getText(ProfilePageLocators.phoneNumber(androidDriver), testReport);
	}

}
