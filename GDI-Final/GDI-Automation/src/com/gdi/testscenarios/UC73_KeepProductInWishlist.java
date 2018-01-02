package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.StudioLocators;
import com.gdi.locators.WishlistLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC73_KeepProductInWishlist {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC73_KeepProductInWishlist(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		keepProductInWishlist();
	}
	
	public static void keepProductInWishlist() throws InterruptedException{
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.wishlistModule(androidDriver), testReport, "wishlistModule");
		Thread.sleep(10000);
		ActionImplementation.click(WishlistLocators.closeProductButton(androidDriver), testReport, "closeProductButton");
		Thread.sleep(2000);
		ActionImplementation.click(WishlistLocators.keepInWishlist(androidDriver), testReport, "keepInWishlistButton");
		Thread.sleep(2000);
	
	}
}
