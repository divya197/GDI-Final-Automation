package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC12_VerifyElementsOnHomePage {
	
		private static AndroidDriver androidDriver;
		private static ExtentTest testReport;
		
		public UC12_VerifyElementsOnHomePage(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
			this.androidDriver = androidDriver;
			this.testReport = testReport;
			verifyElementsonHomePage();
		}
		
		public static void verifyElementsonHomePage() throws InterruptedException{
			
			
			ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
			ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.search(androidDriver), "search", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.tag(androidDriver), "tag", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.storeLocator(androidDriver), "storeLocator", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.shoppingCart(androidDriver), "shoppingCart", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.shopModule(androidDriver), "shopModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.offersModule(androidDriver), "offersModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.studioModule(androidDriver), "studioModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.profileModule(androidDriver), "profileModule", testReport);
			ActionImplementation.verifyPresenceOfElement(HomePageLocators.wishlistModule(androidDriver), "wishlistModule", testReport);	
		}

}
