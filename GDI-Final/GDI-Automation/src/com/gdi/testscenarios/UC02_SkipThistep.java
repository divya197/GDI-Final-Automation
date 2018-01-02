package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC02_SkipThistep {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC02_SkipThistep(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		skipLogin();
	}
	
	public static void skipLogin() throws InterruptedException{
		
		Thread.sleep(1000);
		ActionImplementation.click(LoginPageLocators.skipforNowLink(androidDriver), testReport, "skipForNow");
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		
		ActionImplementation.click(HomePageLocators.offersModule(androidDriver), testReport,"offersModule");
		ActionImplementation.wait(androidDriver,CreateNewAccountLocators.signInNowWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(CreateNewAccountLocators.signInNowButton(androidDriver), "SIGN IN NOW", testReport);
		
//		ActionImplementation.click(HomePageLocators.studioModule(androidDriver), testReport,"studioModule");
//		ActionImplementation.wait(androidDriver,CreateNewAccountLocators.signInNowWait(), testReport);
//		ActionImplementation.verifyPresenceOfElement(CreateNewAccountLocators.signInNowButton(androidDriver), "SIGN IN NOW", testReport);
		
		ActionImplementation.click(HomePageLocators.profileModule(androidDriver), testReport,"profileModule");
		ActionImplementation.wait(androidDriver,CreateNewAccountLocators.signInNowWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(CreateNewAccountLocators.signInNowButton(androidDriver), "SIGN IN NOW", testReport);
		
		ActionImplementation.click(HomePageLocators.wishlistModule(androidDriver), testReport,"wishlistModule");
		ActionImplementation.wait(androidDriver,CreateNewAccountLocators.signInNowWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(CreateNewAccountLocators.signInNowButton(androidDriver), "SIGN IN NOW", testReport);
		
		ActionImplementation.click(HomePageLocators.shoppingCart(androidDriver) ,testReport, "shoppingCart");
		ActionImplementation.wait(androidDriver,CreateNewAccountLocators.signInNowWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(CreateNewAccountLocators.signInNowButton(androidDriver), "SIGN IN NOW", testReport);
		ActionImplementation.click(CreateNewAccountLocators.signInNowButton(androidDriver) ,testReport, "signInNowButton");
		Thread.sleep(6000);

		
	}

}
