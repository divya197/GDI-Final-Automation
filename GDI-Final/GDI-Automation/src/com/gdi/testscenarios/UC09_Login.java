package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC09_Login {
	
		private static AndroidDriver androidDriver;
		private static ExtentTest testReport;
		
		public UC09_Login(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
			this.androidDriver = androidDriver;
			this.testReport = testReport;
			login();
		}
		
		public static void login() throws InterruptedException{
			
			ActionImplementation.wait(androidDriver, LoginPageLocators.joinStaticTextWait(), testReport);
			ActionImplementation.click(LoginPageLocators.loginTab(androidDriver), testReport,"loginTab");
			ActionImplementation.sendKeys(LoginPageLocators.enterYourEmail(androidDriver), ActionImplementation.userID, testReport);
			ActionImplementation.click(LoginPageLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
			ActionImplementation.sendKeys(LoginPageLocators.enterYourPassword(androidDriver), "Qwerty123$", testReport);
			ActionImplementation.click(LoginPageLocators.joinToEarnStaticText(androidDriver), testReport,"joinToEarnStaticText");
			ActionImplementation.click(LoginPageLocators.letsGoButton(androidDriver), testReport,"letsGoButton");
		
		}
}
