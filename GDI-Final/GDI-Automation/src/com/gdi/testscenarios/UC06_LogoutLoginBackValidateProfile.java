package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.ProfileNotificationLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC06_LogoutLoginBackValidateProfile {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC06_LogoutLoginBackValidateProfile(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		logoutLoginBackValidateProfile();
	}
	
	public static void logoutLoginBackValidateProfile() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.profileModule(androidDriver),testReport,"profileModule");
		Thread.sleep(10000);
		ActionImplementation.click( ProfilePageLocators.orderHistoryTab(androidDriver),testReport,"orderHistoryTab");
		Thread.sleep(3000);
		ActionImplementation.click(ProfilePageLocators.personalInfoTab(androidDriver), testReport,"personalInfoTab");
		Thread.sleep(5000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePageLocators.logOutButton(androidDriver), testReport,"logOutButton");
		Thread.sleep(5000);
		ActionImplementation.click(ProfilePageLocators.logOutOKButton(androidDriver), testReport,"logOutOKButton");
		Thread.sleep(2000);
		UC09_Login login = new UC09_Login(androidDriver, testReport);
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.profileModule(androidDriver),testReport,"profileModule");
		Thread.sleep(15000);
		ActionImplementation.click( ProfilePageLocators.orderHistoryTab(androidDriver),testReport,"orderHistoryTab");
		Thread.sleep(3000);
		ActionImplementation.click(ProfilePageLocators.personalInfoTab(androidDriver), testReport,"personalInfoTab");
		Thread.sleep(4000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		String expName="Test user";
		ActionImplementation.verifyTextOfElement(ProfilePageLocators.savedName(androidDriver), expName, testReport);
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		ActionImplementation.click(ProfilePageLocators.logOutButton(androidDriver), testReport,"logOutButton");
		Thread.sleep(5000);
		ActionImplementation.click(ProfilePageLocators.logOutOKButton(androidDriver), testReport,"logOutOKButton");
	}

}
