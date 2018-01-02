package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC60_UpdateProfileButton {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC60_UpdateProfileButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		updateProfileButton();
	}
	
	public static void updateProfileButton() throws InterruptedException{
		
		ActionImplementation.click(ProfilePageLocators.updateProfile(androidDriver), testReport, "updateProfileButton");
		Thread.sleep(6000);
		
		
	}

}
