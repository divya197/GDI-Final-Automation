package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC39_CheckOutWithoutSavingcreditCard {
	
		private static AndroidDriver androidDriver;
	    private static ExtentTest testReport;

		public UC39_CheckOutWithoutSavingcreditCard(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
			this.androidDriver = androidDriver;
			this.testReport = testReport;
			checkOutWithoutSavingcreditCard();
		}
		
		public static void checkOutWithoutSavingcreditCard() throws InterruptedException{	
			
			ActionImplementation.click(CartLocators.unCheckSaveCreditCard(androidDriver), testReport, "unCheckSaveCreditCard");
			Thread.sleep(1000);
			ActionImplementation.click(CartLocators.saveCreditCardButton(androidDriver), testReport, "saveCreditCardButton");
			Thread.sleep(5000);
			
		}

}
