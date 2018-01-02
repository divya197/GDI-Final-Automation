package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC69_SeeRewardsLink {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC69_SeeRewardsLink(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		seeRewardsLink();
	}
	
	public static void seeRewardsLink() throws InterruptedException{
		
		Thread.sleep(1000);
		ActionImplementation.click(StudioLocators.seeRewardsLink(androidDriver),testReport,"seeRewardsLink");
		Thread.sleep(2000);
		
	}
}
