package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC35_SaveSelectShipping {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC35_SaveSelectShipping(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		saveSelectShipping();
	}
	
	public static void saveSelectShipping() throws InterruptedException{	
		Thread.sleep(6000);
		ActionImplementation.wait(androidDriver, CartLocators.saveSelectShippingWait(), testReport);
		ActionImplementation.click(CartLocators.saveSelectShipping(androidDriver), testReport, "saveSelectShipping");
		
	}

}
