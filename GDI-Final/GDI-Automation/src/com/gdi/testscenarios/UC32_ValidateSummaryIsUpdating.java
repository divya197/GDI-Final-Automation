package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC32_ValidateSummaryIsUpdating {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC32_ValidateSummaryIsUpdating(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		validateSummaryIsUpdating();
	}
	
	public static void validateSummaryIsUpdating() throws InterruptedException{	
		
		ActionImplementation.getText(PDPLocators.bagQuantity(androidDriver), testReport);
		
	}
}
