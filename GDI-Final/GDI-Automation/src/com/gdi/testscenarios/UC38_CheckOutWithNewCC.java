package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC38_CheckOutWithNewCC {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC38_CheckOutWithNewCC(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		checkOutWithNewCC();
	}
	
	public static void checkOutWithNewCC() throws InterruptedException{	
		
		Thread.sleep(2000);
		ActionImplementation.click(CartLocators.billingAddressStaticText(androidDriver), testReport, "billingAddressStaticText");
		Thread.sleep(1000);
		ActionImplementation.sendKeys(CartLocators.enterCreditCardNumber(androidDriver), "4111111111111111", testReport);
		Thread.sleep(1000);
		ActionImplementation.sendKeys(CartLocators.enterMonthYear(androidDriver), "12/21", testReport);
		Thread.sleep(1000);
		ActionImplementation.sendKeys(CartLocators.enterCVV(androidDriver),"123",testReport);
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		
	}	

}
