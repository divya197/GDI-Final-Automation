package com.gdi.testscenarios;

import com.gdi.locators.StoreLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC44_StoreSelection {

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC44_StoreSelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		storeSelection();
	}
	
	public static void storeSelection() throws InterruptedException{	
		
		Thread.sleep(3000);
		ActionImplementation.verifyPresenceOfElement(StoreLocators.getDirections(androidDriver), "getDirections", testReport);
		Thread.sleep(1000);
		ActionImplementation.click(StoreLocators.closeButton(androidDriver), testReport, "closeButton");
		Thread.sleep(3000);
		
	}
	
}
