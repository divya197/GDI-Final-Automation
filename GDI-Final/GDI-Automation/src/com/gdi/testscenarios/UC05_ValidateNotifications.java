package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.ProfileNotificationLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC05_ValidateNotifications {
		
		private static AndroidDriver androidDriver;
		private static ExtentTest testReport;
		
		public UC05_ValidateNotifications(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
			this.androidDriver = androidDriver;
			this.testReport = testReport;
			ValidateNotifications();
		}
		
		public static void ValidateNotifications() throws InterruptedException{
			
			Thread.sleep(2000);
			ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
			Thread.sleep(3000);
			String shopNotificationExpText = "You Have 1 New Offer";
			ActionImplementation.verifyTextOfElement(ProfileNotificationLocators.shopBannerNotification(androidDriver),shopNotificationExpText,testReport);
			Thread.sleep(1000);
			ActionImplementation.click(HomePageLocators.offersModule(androidDriver), testReport,"offersModule");
			Thread.sleep(3000);
			String offerNotificationExpText = "10% OF ONE PURCHASE LOY17PROFIL10";
			ActionImplementation.verifyTextOfElement(ProfileNotificationLocators.offerNotification(androidDriver),offerNotificationExpText,testReport);
			Thread.sleep(1000);
		}
	}

