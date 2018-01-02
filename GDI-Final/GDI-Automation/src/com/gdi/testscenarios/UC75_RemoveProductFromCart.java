package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC75_RemoveProductFromCart {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC75_RemoveProductFromCart(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		removeProductFromCart();
	}
	
	public static void removeProductFromCart() throws InterruptedException{	
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.shoppingCart(androidDriver), testReport, "shoppingCart");
		Thread.sleep(10000);
		ActionImplementation.wait(androidDriver, CartLocators.YourShoppingbagWait(), testReport);
		ActionImplementation.click(CartLocators.removeProductCloseButton(androidDriver),testReport,"removeCloseButton");
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.removeFromBagButton(androidDriver),testReport,"removeFromBagButton");
		Thread.sleep(10000);
		ActionImplementation.wait(androidDriver, CartLocators.YourShoppingbagWait(), testReport);
		
	}
}
