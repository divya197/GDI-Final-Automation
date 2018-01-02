package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC29_BagQuantity {


	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC29_BagQuantity(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		bagQuantity();
	}
	
	public static void bagQuantity() throws InterruptedException{	
		
		ActionImplementation.getText(PDPLocators.bagQuantity(androidDriver), testReport);
		ActionImplementation.click(HomePageLocators.shoppingCart(androidDriver), testReport, "shoppingCart");
		ActionImplementation.wait(androidDriver, CartLocators.YourShoppingbagWait(), testReport);
		Thread.sleep(10000);
	}
}
