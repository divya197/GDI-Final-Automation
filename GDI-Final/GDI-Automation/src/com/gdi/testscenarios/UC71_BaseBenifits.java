package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC71_BaseBenifits {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC71_BaseBenifits(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		baseBenifits();
	}
	
	public static void baseBenifits() throws InterruptedException{
		
		Thread.sleep(2000);
		ActionImplementation.click(StudioLocators.baseBenefits(androidDriver), testReport, "baseBenefits");
		Thread.sleep(1000);
	}


}
