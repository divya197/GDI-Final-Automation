package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC50_ValidateTagScanButton {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC50_ValidateTagScanButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		validateTagScanButton();
	}
	
	public static void validateTagScanButton() throws InterruptedException{
	
		Thread.sleep(1000);
		ActionImplementation.verifyPresenceOfElement(ProfilePageLocators.tagScan(androidDriver), "tagScan", testReport);
	}
}
