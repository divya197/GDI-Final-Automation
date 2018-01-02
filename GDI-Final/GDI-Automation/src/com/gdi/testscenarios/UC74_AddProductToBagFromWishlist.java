package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.WishlistLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC74_AddProductToBagFromWishlist {
	
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC74_AddProductToBagFromWishlist(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		addProductToBagFromWishlist();
	}
	
	public static void addProductToBagFromWishlist() throws InterruptedException{	
		Thread.sleep(2000);
		ActionImplementation.click(WishlistLocators.addToBag(androidDriver), testReport, "addToBag");
		Thread.sleep(1000);
		ActionImplementation.wait(androidDriver, WishlistLocators.OopsMessageWait(), testReport);

	}
}