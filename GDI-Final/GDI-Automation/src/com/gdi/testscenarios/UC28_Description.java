package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC28_Description {


	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC28_Description(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		description();
	}
	
	public static void description() throws InterruptedException{	
		
		ActionImplementation.click(PDPLocators.infoButton(androidDriver), testReport, "infoButton");
		Thread.sleep(1000);
		ActionImplementation.wait(androidDriver, PDPLocators.descriptionWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(PDPLocators.description(androidDriver), "description", testReport);
		ActionImplementation.click(PDPLocators.closeDescriptionWindow(androidDriver),testReport, "closeDescriptionWindow");
		ActionImplementation.wait(androidDriver, PDPLocators.findInStoreWait(), testReport);
		
	}
	

	
}
