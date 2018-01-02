package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC51_GetFirstName {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC51_GetFirstName(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		getFirstName();
	}
	
	public static void getFirstName() throws InterruptedException{
	
	
	
	ActionImplementation.click( ProfilePageLocators.orderHistoryTab(androidDriver),testReport,"orderHistoryTab");
	Thread.sleep(3000);
	ActionImplementation.click(ProfilePageLocators.personalInfoTab(androidDriver), testReport,"personalInfoTab");
	Thread.sleep(3000);
	ActionImplementation.getText(ProfilePageLocators.firstName(androidDriver), testReport);
	
	}
	
}
