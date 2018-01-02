package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC70_RewardsAndBenifitsTitle {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC70_RewardsAndBenifitsTitle(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		rewardsAndBenifitsTitle();
	}
	
	public static void rewardsAndBenifitsTitle() throws InterruptedException{
		
		Thread.sleep(2000);
		ActionImplementation.verifyPresenceOfElement(StudioLocators.rewordsBenifitsTitle(androidDriver), "Rewards & Benifits", testReport);
	}

}
