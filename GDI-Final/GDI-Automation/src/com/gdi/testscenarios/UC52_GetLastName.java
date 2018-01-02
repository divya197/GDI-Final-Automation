package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC52_GetLastName {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC52_GetLastName(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		getLastName();
	}
	
	public static void getLastName() throws InterruptedException{
	
	
	

	ActionImplementation.getText(ProfilePageLocators.lastName(androidDriver), testReport);
	
	}

}
