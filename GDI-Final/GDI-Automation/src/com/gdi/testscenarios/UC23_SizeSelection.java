package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC23_SizeSelection {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC23_SizeSelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		sizeSelection();
	}
	
	public static void sizeSelection() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, PDPLocators.sizeText(), testReport);
		//ActionImplementation.SizeSelection(androidDriver, testReport);
		Thread.sleep(3000);
		ActionImplementation.click(PDPLocators.sizePanel(androidDriver), testReport, "sizePanel");
		Thread.sleep(1000);
		ActionImplementation.click(PDPLocators.sizeXS(androidDriver), testReport, "sizeXS");
		Thread.sleep(2000);
		
		
		
	}
} 
