package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC58_AddNewAddress {
	

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC58_AddNewAddress(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		addNewAddress();
	}
	
	public static void addNewAddress() throws InterruptedException{
		
		
		Thread.sleep(2000);
		ActionImplementation.click(ProfilePageLocators.addNewAddreesLink(androidDriver), testReport, "addNewAddreesLink");
		Thread.sleep(4000);
		ActionImplementation.click(ProfilePageLocators.closeEditAddressButton(androidDriver),testReport, "closeEditAddressButton");
		Thread.sleep(2000);
		

	}
}
