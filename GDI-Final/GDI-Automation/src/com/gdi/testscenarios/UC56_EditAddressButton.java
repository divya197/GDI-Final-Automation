package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC56_EditAddressButton {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC56_EditAddressButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		editAddressButton();
	}
	
	public static void editAddressButton() throws InterruptedException{
		
		
		ActionImplementation.click(ProfilePageLocators.editAddressButton(androidDriver), testReport, "editAddressButton");
		Thread.sleep(4000);
		ActionImplementation.click(ProfilePageLocators.closeEditAddressButton(androidDriver), testReport, "closeEditAddressButton");
		Thread.sleep(2000);
		
		
	}

}
