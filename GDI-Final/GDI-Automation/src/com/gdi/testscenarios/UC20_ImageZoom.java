package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC20_ImageZoom {
	
	private static AndroidDriver androidDriver;
private static ExtentTest testReport;
	
	public UC20_ImageZoom(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		imageZoom();
	}
	
	public static void imageZoom() throws InterruptedException{
		
		Thread.sleep(10000);
		ActionImplementation.click(PDPLocators.productImage(androidDriver), testReport,"productImage");
		Thread.sleep(2000);
		ActionImplementation.click(PDPLocators.productImage(androidDriver), testReport,"productImage");
		Thread.sleep(2000);
		
	}
}
