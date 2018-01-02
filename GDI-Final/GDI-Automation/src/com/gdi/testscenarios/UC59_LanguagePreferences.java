package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC59_LanguagePreferences {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC59_LanguagePreferences(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		languagePreferences();
	}
	
	public static void languagePreferences() throws InterruptedException{
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePageLocators.francais(androidDriver), testReport, "francaisradioButton");
		Thread.sleep(1000);
		
	}

}
