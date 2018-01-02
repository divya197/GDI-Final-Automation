package com.gdi.testscenarios;

import org.openqa.selenium.WebElement;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.OfferPageLocators;
import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC65_MyStudioTitle {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC65_MyStudioTitle(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		myStudioTitle();
	}
	
	public static void myStudioTitle() throws InterruptedException{
		
		ActionImplementation.click(HomePageLocators.studioModule(androidDriver), testReport, "studioModule");
		Thread.sleep(3000);
		ActionImplementation.wait(androidDriver, StudioLocators.MyStudioTitleWait(), testReport);
		ActionImplementation.verifyPresenceOfElement(StudioLocators.MyStudioTitleText(androidDriver), "Collect all 6 badges to reach VIP status and unlock more rewards! SEE REWARDS", testReport);
	
	}
}
