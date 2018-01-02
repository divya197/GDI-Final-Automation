package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC46_MyProfile {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC46_MyProfile(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		myProfile();
	}
	
	public static void myProfile() throws InterruptedException{
		
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.profileModule(androidDriver), testReport,"shopModule");
		Thread.sleep(10000);
		
		
		ActionImplementation.verifyPresenceOfElement(ProfilePageLocators.paymentInfoTab(androidDriver), "paymentInfoTab", testReport);
		
		
		
	}

}
