package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC27_FindInStore {
	
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC27_FindInStore(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		findInStore();
	}
	
	public static void findInStore() throws InterruptedException{	
		
		ActionImplementation.verifyPresenceOfElement(PDPLocators.findInStore(androidDriver), "findInStore", testReport);
		
		
	}

}
