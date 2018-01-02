package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC57_RemoveAddressButton {


	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC57_RemoveAddressButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		removeAddressButton();
	}
	
	public static void removeAddressButton() throws InterruptedException{
		
		
		ActionImplementation.click(ProfilePageLocators.removeAddressButton(androidDriver), testReport, "editAddressButton");
		Thread.sleep(2000);
		ActionImplementation.click(ProfilePageLocators.undoButton(androidDriver), testReport, "undoButton");
		Thread.sleep(2000);
		
	}
	
	
}
