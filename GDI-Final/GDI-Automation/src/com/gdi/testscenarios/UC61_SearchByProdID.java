package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.locators.SearchLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC61_SearchByProdID {
	

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC61_SearchByProdID(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		searchByProdID();
	}
	
	public static void searchByProdID() throws InterruptedException{
		Thread.sleep(4000);
		ActionImplementation.click(HomePageLocators.search(androidDriver), testReport, "Search");
		Thread.sleep(8000);
		ActionImplementation.sendKeys(SearchLocators.enterTextInSerach(androidDriver), "100027651", testReport);
		Thread.sleep(15000);
		ActionImplementation.click(SearchLocators.selectFromSerarchBox(androidDriver), testReport, "selectFromSerarchBox");
		Thread.sleep(15000);
		
		ActionImplementation.getText(SearchLocators.productName(androidDriver), testReport);
		Thread.sleep(1000);
		ActionImplementation.click(SearchLocators.backButton(androidDriver), testReport, "backButton");
		Thread.sleep(4000);


	}
}
