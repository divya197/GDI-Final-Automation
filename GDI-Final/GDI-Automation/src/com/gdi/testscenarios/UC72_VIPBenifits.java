package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC72_VIPBenifits {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC72_VIPBenifits(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		vIPBenifits();
	}
	
	public static void vIPBenifits() throws InterruptedException{
		
	
		ActionImplementation.click(StudioLocators.vipBenefits(androidDriver), testReport, "vipBenefits");
		Thread.sleep(1000);
		ActionImplementation.click(StudioLocators.closeRewardsButton(androidDriver), testReport, "closeRewardsButton");
		Thread.sleep(2000);
	}
}
