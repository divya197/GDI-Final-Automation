package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PLPLocators;
import com.gdi.locators.WishlistLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class UC18_NavigateToSubCategiries {

	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC18_NavigateToSubCategiries(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		navigateToSubCategiries();
	}
	
	public static void navigateToSubCategiries() throws InterruptedException{
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.wishlistModule(androidDriver), testReport,"wishlistModule");
		ActionImplementation.wait(androidDriver, WishlistLocators.OopsMessageWait(), testReport);
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(4000);
		//TOPS
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		
		ActionImplementation.click(HomePageLocators.tops(androidDriver), testReport,"tops");
		Thread.sleep(12000);
		
		try{
			ActionImplementation.verifyPresenceOfElement(PLPLocators.firstSubCategoryProduct(androidDriver), "firstSubCategory",testReport);
			Thread.sleep(2000);
			
		}
		catch(Exception e){
			e.printStackTrace();
			testReport.log(LogStatus.FAIL, "TOPS subcategory is not not present");	
			ActionImplementation.click(PLPLocators.backButton(androidDriver), testReport, "backButton");
		}
		
		ActionImplementation.click(PLPLocators.navigateFirstSubCategory(androidDriver), testReport,"navigateFirstSubCategory");
		Thread.sleep(2000);
		ActionImplementation.click(PLPLocators.navigateSecondSubCategory(androidDriver), testReport,"navigateSecondSubCategory");
		Thread.sleep(2000);
		ActionImplementation.click(PLPLocators.navigateThirdSubCategory(androidDriver), testReport,"navigateThirdSubCategory");
		Thread.sleep(2000);
		
		
			
	}	
}
