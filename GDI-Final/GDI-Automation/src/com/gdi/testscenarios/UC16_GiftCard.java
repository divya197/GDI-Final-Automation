package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC16_GiftCard {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC16_GiftCard(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		giftCard();
	}
	
	public static void giftCard() throws InterruptedException{
		
//		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
//		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
//		Thread.sleep(4000);
//		ActionImplementation.scrollScreen(androidDriver, testReport);
//		Thread.sleep(1000);
//		ActionImplementation.scrollScreen(androidDriver, testReport);
//		Thread.sleep(1000);
//		ActionImplementation.scrollScreen(androidDriver, testReport);
//		Thread.sleep(1000);
//		ActionImplementation.scrollScreen(androidDriver, testReport);
//		Thread.sleep(1000);
//		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(HomePageLocators.giftCard(androidDriver), testReport,"giftCard");
		ActionImplementation.wait(androidDriver, HomePageLocators.giftCardPageWait(), testReport);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		ActionImplementation.click(HomePageLocators.selectGiftCard(androidDriver),testReport,"selectgiftCard");
		ActionImplementation.click(HomePageLocators.addGiftCardtoCart(androidDriver),testReport,"addgiftCardTobag");
		ActionImplementation.wait(androidDriver, HomePageLocators.giftCardPageWait(), testReport);
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.backButton(androidDriver),testReport,"backButton");
		Thread.sleep(3000);
	}
	
}
