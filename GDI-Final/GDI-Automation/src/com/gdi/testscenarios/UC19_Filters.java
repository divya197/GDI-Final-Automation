package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PLPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class UC19_Filters {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC19_Filters(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		filters();
	}
	
	public static void filters() throws InterruptedException{
		
		Thread.sleep(3000);
		ActionImplementation.click(PLPLocators.filterButton(androidDriver), testReport, "filterButton");
		
		ActionImplementation.wait(androidDriver, PLPLocators.findYourfavsWait(androidDriver), testReport);
		ActionImplementation.click(PLPLocators.priceHighToLow(androidDriver), testReport, "priceHighToLow");
		ActionImplementation.click(PLPLocators.sizeXS(androidDriver), testReport, "sizeXS");
		ActionImplementation.click(PLPLocators.sizeS(androidDriver), testReport, "sizeS");
		ActionImplementation.click(PLPLocators.sizeM(androidDriver), testReport, "sizeM");
		
		Thread.sleep(10000);
		ActionImplementation.wait(androidDriver, PLPLocators.findYourfavsWait(androidDriver), testReport);
	
		ActionImplementation.click(PLPLocators.filterResults(androidDriver), testReport, "filterResults");
		Thread.sleep(8000);
		ActionImplementation.click(PLPLocators.firstSubCategoryProduct(androidDriver), testReport, "firstSubCategoryProduct");
		Thread.sleep(2000);
		
		
	}
	
	
	
	
}
