package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC22_SendShare {
	

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC22_SendShare(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		sendShare();
	}
	
	public static void sendShare() throws InterruptedException{	
		
		
		ActionImplementation.verifyPresenceOfElement(PDPLocators.sendShare(androidDriver), "sendShare",testReport);
		
	}
}
	
