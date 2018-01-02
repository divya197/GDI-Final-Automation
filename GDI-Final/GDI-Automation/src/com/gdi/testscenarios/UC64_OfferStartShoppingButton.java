package com.gdi.testscenarios;

import com.gdi.locators.OfferPageLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC64_OfferStartShoppingButton {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC64_OfferStartShoppingButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		offerStartShoppingButton();
	}
	
	public static void offerStartShoppingButton() throws InterruptedException{
	
	ActionImplementation.click(OfferPageLocators.startShoppingButton(androidDriver), testReport, "startShoppingButton");
	
	}

}
