package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC34_CheckOutButton {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC34_CheckOutButton(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		checkOutButton();
	}
	
	public static void checkOutButton() throws InterruptedException{	
		
		Thread.sleep(2000);
		ActionImplementation.click(CartLocators.checkOutButton(androidDriver), testReport, "checkOutButton");
		
	}
	
}
