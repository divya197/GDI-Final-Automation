package com.gdi.testscenarios;

import com.gdi.locators.StoreLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC42_ProvinceSelection {
	
	
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC42_ProvinceSelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		provinceSelection();
	}
	
	public static void provinceSelection() throws InterruptedException{	
		
		ActionImplementation.wait(androidDriver, StoreLocators.CanadaABwait(), testReport);
		ActionImplementation.click(StoreLocators.selectProvienceAB(androidDriver), testReport, "ProvienceABbutton");
		
		
	}
}
