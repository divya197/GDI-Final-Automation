package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC45_ValidateBottomButtons {
	

		private static AndroidDriver androidDriver;
	    private static ExtentTest testReport;

		public UC45_ValidateBottomButtons(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
			this.androidDriver = androidDriver;
			this.testReport = testReport;
			validateBottomButtons();
		}
		
		public static void validateBottomButtons() throws InterruptedException{	
			
			ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.shopModule(androidDriver), "shopModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.offersModule(androidDriver), "offersModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.studioModule(androidDriver), "studioModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.profileModule(androidDriver), "profileModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.wishlistModule(androidDriver), "wishlistModule", testReport);	
		}
}
