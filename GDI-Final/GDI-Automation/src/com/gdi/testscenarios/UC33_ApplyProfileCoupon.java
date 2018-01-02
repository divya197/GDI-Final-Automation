package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC33_ApplyProfileCoupon {

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC33_ApplyProfileCoupon(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		applyProfileCoupon();
	}
	
	public static void applyProfileCoupon() throws InterruptedException{
		
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.applyProfileCoupon(androidDriver), testReport, "ApplyProfileCouponButton");
		Thread.sleep(4000);
		ActionImplementation.wait(androidDriver, CartLocators.YourShoppingbagWait(), testReport);
		
	}
	

}
