package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.StoreLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC41_CountrySelection {
	
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC41_CountrySelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		countrySelection();
	}
	
	public static void countrySelection() throws InterruptedException{	
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(8000);
		ActionImplementation.click(HomePageLocators.storeLocator(androidDriver), testReport,"storeLocator");
		ActionImplementation.wait(androidDriver, StoreLocators.CanadaABwait(), testReport);
		ActionImplementation.click(StoreLocators.changeCountrySelectionLink(androidDriver), testReport, "changeCountrySelectionLink");
		ActionImplementation.wait(androidDriver, StoreLocators.CountrySelectionwait(),testReport);
		ActionImplementation.click(StoreLocators.selectCountryCAN(androidDriver), testReport, "selectCountryCAN");
		
		
		
		
		
	}

}
