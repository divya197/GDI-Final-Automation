package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC21_TextPrice {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;
	
	public UC21_TextPrice(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		textPrice();
	}
	
	public static void textPrice() throws InterruptedException{	
		
		ActionImplementation.getText(PDPLocators.textPrice(androidDriver), testReport);
		
	}
}
