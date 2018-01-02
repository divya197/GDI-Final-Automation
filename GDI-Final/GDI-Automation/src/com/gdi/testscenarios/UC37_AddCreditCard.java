package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC37_AddCreditCard {
	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC37_AddCreditCard(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		addCreditCard();
	}
	
	public static void addCreditCard() throws InterruptedException{	
		
		Thread.sleep(4000);
		ActionImplementation.wait(androidDriver, CartLocators.addCreditCardWait(), testReport);
		ActionImplementation.click(CartLocators.addCreditCardImage(androidDriver), testReport, "addCreditCardImage");
		Thread.sleep(3000);
		
	}
}
