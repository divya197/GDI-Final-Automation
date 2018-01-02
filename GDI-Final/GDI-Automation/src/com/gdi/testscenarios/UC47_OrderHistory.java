package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC47_OrderHistory {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC47_OrderHistory(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		orderHistory();
	}
	
	public static void orderHistory() throws InterruptedException{
		
	ActionImplementation.verifyPresenceOfElement(ProfilePageLocators.orderHistoryTab(androidDriver), "orderHistoryTab", testReport);
	}
}
