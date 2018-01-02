package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.WishlistLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC13_EmptyWishlistMessage {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC13_EmptyWishlistMessage(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		emptyWishlistMessage();
	}
	
	public static void emptyWishlistMessage() throws InterruptedException{
		
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.wishlistModule(androidDriver),testReport,"Wishlist");
		ActionImplementation.wait(androidDriver, WishlistLocators.OopsMessageWait(), testReport);
		String ExpectedEmptyWishlistMesaage= "Your wishlist is empty.";
		ActionImplementation.verifyTextOfElement(WishlistLocators.emptyWishlistMessage(androidDriver),ExpectedEmptyWishlistMesaage , testReport);
		
		
		
	
	}
}
