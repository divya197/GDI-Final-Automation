package com.gdi.testscenarios;

import com.gdi.locators.StoreLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC43_CitySelection {
	
	
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC43_CitySelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		citySelection();
	}
	
	public static void citySelection() throws InterruptedException{	
	
	Thread.sleep(4000);
	ActionImplementation.click(StoreLocators.selectCityCalagry(androidDriver), testReport, "CityCalagrybutton");
	
	
	}
}
