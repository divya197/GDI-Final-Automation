package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC26_SaveToWishList {
	

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC26_SaveToWishList(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		saveToWishlist();
	}
	
	public static void saveToWishlist() throws InterruptedException{	
		
		Thread.sleep(3000);
		ActionImplementation.click(PDPLocators.saveToWishlist(androidDriver),testReport,"saveToWishlist");
		Thread.sleep(5000);
		ActionImplementation.wait(androidDriver, PDPLocators.findInStoreWait(), testReport);
		Thread.sleep(1000);
	}

}
