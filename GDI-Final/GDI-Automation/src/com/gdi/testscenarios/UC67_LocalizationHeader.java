package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC67_LocalizationHeader {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC67_LocalizationHeader(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		localizationHeader();
	}
	
	public static void localizationHeader() throws InterruptedException{
		
		ActionImplementation.verifyPresenceOfElement(StudioLocators.localizationHeader(androidDriver), "localizationHeader", testReport);
	}
}
