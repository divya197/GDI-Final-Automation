package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC25_AddToBag {
	

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC25_AddToBag(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		addToBag();
	}
	
	public static void addToBag() throws InterruptedException{	
		
		
		ActionImplementation.click(PDPLocators.addTobag(androidDriver),testReport,"addTobag");
		Thread.sleep(5000);
		ActionImplementation.wait(androidDriver, PDPLocators.findInStoreWait(), testReport);
	
}
}