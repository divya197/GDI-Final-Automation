package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC66_StudioInfoHeader {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC66_StudioInfoHeader(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		studioInfoHeader();
	}
	
	public static void studioInfoHeader() throws InterruptedException{
		
		ActionImplementation.click(StudioLocators.infoHeader(androidDriver), testReport, "infoHeader");
		ActionImplementation.wait(androidDriver, StudioLocators.whatIsGarageStudioWait(), testReport);
		ActionImplementation.click(StudioLocators.whatIsGarageStudioText(androidDriver), testReport, "whatIsGarageStudioText");
		ActionImplementation.click(StudioLocators.closeInfoButton(androidDriver), testReport, "closeInfoButton");
		Thread.sleep(2000);
	}
	
}
