package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC55_BirthdayEdit {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC55_BirthdayEdit(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		birthdayEdit();
	}
	
	public static void birthdayEdit() throws InterruptedException{
		
		
		ActionImplementation.scrollScreen(androidDriver, testReport);
		ActionImplementation.click(ProfilePageLocators.birthdayLink(androidDriver), testReport, "birthdayLink");
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePageLocators.birthdayOKButton(androidDriver), testReport, "birthdayOKButton");
		
	}

}
