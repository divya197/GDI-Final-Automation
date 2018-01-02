package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC48_CustomerId {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC48_CustomerId(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		customerId();
	}
	
	public static void customerId() throws InterruptedException{
		
		ActionImplementation.verifyPresenceOfElement(ProfilePageLocators.customerIdTab(androidDriver), "customerIdTab", testReport);
		
	}	
}
