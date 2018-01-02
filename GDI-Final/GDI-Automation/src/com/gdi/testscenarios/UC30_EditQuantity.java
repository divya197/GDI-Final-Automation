package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC30_EditQuantity {

	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC30_EditQuantity(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		editQuantity();
	}
	
	public static void editQuantity() throws InterruptedException{	
		
		
		Thread.sleep(3000);
		ActionImplementation.swipe(androidDriver, CartLocators.editImage(androidDriver), "LEFT", testReport);
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.editQuantity(androidDriver), testReport, "editQuantity");
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.plusButton(androidDriver), testReport, "plusButton");
		Thread.sleep(1000);
		//ActionImplementation.click(CartLocators.closeEditButton(androidDriver), testReport, "closeButton");
		Thread.sleep(10000);
		ActionImplementation.wait(androidDriver, CartLocators.YourShoppingbagWait(), testReport);
		Thread.sleep(3000);
	}
}
