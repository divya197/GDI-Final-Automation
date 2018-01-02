package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC36_ShippingMethod {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC36_ShippingMethod(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		shippingMethod();
	}
	
	public static void shippingMethod() throws InterruptedException{	
		Thread.sleep(8000);
		ActionImplementation.wait(androidDriver, CartLocators.selectPaymentWait(), testReport);
		ActionImplementation.click(CartLocators.selectPayment(androidDriver), testReport, "selectPayment");
		Thread.sleep(10000);
		
	}

}
