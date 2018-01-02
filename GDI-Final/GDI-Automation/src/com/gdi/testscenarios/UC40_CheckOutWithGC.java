package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC40_CheckOutWithGC {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC40_CheckOutWithGC(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		checkOutWithGC();
	}
	
	public static void checkOutWithGC() throws InterruptedException{	
		
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.placeYourOrderButton(androidDriver), testReport, "placeYourOrderButton");
		Thread.sleep(18000);
		ActionImplementation.wait(androidDriver, CartLocators.keepShoppingWait(), testReport);
		ActionImplementation.click(CartLocators.continueshopping(androidDriver), testReport, "continueshopping");
		Thread.sleep(2000);
		
	}

}
