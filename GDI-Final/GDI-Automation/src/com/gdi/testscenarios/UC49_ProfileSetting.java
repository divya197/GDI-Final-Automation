package com.gdi.testscenarios;

import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC49_ProfileSetting {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC49_ProfileSetting(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		profileSetting();
	}
	
	public static void profileSetting() throws InterruptedException{
		ActionImplementation.click(ProfilePageLocators.setting(androidDriver), testReport, "setting");
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePageLocators.closeSettingbutton(androidDriver),testReport, "closeSettingbutton");
		
		
		
	}

}
