package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC14_CarousalLinks {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC14_CarousalLinks(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		carousalLinks();
	}
	
	public static void carousalLinks() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(4000);
//		ActionImplementation.click(HomePageLocators.firstCarousal(androidDriver), testReport,"firstCarousal");
//		ActionImplementation.verifySubCategory(androidDriver, testReport);
//		Thread.sleep(1000);
		ActionImplementation.click(HomePageLocators.firstCarousal(androidDriver), testReport, "firstCarousal");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "TOPS");
		Thread.sleep(2000);
		
	//	ActionImplementation.swipe(androidDriver, HomePageLocators.firstCarousal(androidDriver), "LEFT", testReport);
		Thread.sleep(2000);
		
		
		
		
//		//First Carousal Check
//		ActionImplementation.wait(androidDriver, HomePageLocators.firstCarousalWait(),testReport);
//		ActionImplementation.click(HomePageLocators.firstCarousal(androidDriver), testReport,"firstCarousal");
//		ActionImplementation.wait(androidDriver, HomePageLocators.subCategoryWait(),testReport);
//		ActionImplementation.verifyPresenceOfElement(HomePageLocators.subCategoryCheck(androidDriver), testReport);
//		ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
//		ActionImplementation.swipe(androidDriver, HomePageLocators.firstCarousal(androidDriver), "LEFT", testReport);
//		
//		//Second Carousal Check
//		ActionImplementation.click(HomePageLocators.secondCarousal(androidDriver), testReport,"secondCarousal");
//		ActionImplementation.wait(androidDriver, HomePageLocators.subCategoryWait(),testReport);
//		ActionImplementation.verifyPresenceOfElement(HomePageLocators.subCategoryCheck(androidDriver), testReport);
//		ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
//		ActionImplementation.swipe(androidDriver, HomePageLocators.secondCarousal(androidDriver), "LEFT", testReport);
//		
//		//Third Carousal Check
//		ActionImplementation.click(HomePageLocators.thirdCarousal(androidDriver), testReport,"thirdCarousal");
//		ActionImplementation.wait(androidDriver, HomePageLocators.subCategoryWait(),testReport);
//		ActionImplementation.verifyPresenceOfElement(HomePageLocators.subCategoryCheck(androidDriver), testReport);
//		ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
		
		
	
		
		
	}

}
