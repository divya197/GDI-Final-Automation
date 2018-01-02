package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC10_EmptyBagMessage {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC10_EmptyBagMessage(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		emptyBagMessage();
	}
	
	public static void emptyBagMessage() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(4000);
		ActionImplementation.click(HomePageLocators.shoppingCart(androidDriver), testReport, "Bag");
		ActionImplementation.wait(androidDriver, CartLocators.OopsMessageWait(), testReport);
		String ExpectedEmptyBagMesaage= "Seems like your bag is empty!";
		ActionImplementation.verifyTextOfElement(CartLocators.emptyBag(androidDriver),ExpectedEmptyBagMesaage , testReport);
		Thread.sleep(7000);
		ActionImplementation.click(CartLocators.backButton(androidDriver), testReport, "backButton");
	}
}
