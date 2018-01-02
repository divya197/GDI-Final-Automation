package com.gdi.testscenarios;

import com.gdi.locators.StudioLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC68_SlideBetweenBadges {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC68_SlideBetweenBadges(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		slideBetweenBadges();
	}
	
	public static void slideBetweenBadges() throws InterruptedException{
		
		Thread.sleep(2000);
		ActionImplementation.click(StudioLocators.buyTwoWaysbadge(androidDriver), testReport, "buyTwoWaysbadge"); 
		Thread.sleep(2000);
		ActionImplementation.swipe(androidDriver, StudioLocators.footerInfo(androidDriver), "LEFT", testReport);
		Thread.sleep(1000);
		ActionImplementation.getText(StudioLocators.footerInfo(androidDriver), testReport);
		
		ActionImplementation.swipe(androidDriver, StudioLocators.slideFooter(androidDriver), "LEFT", testReport);
		Thread.sleep(1000);
		ActionImplementation.getText(StudioLocators.footerInfo(androidDriver), testReport);
		
		ActionImplementation.swipe(androidDriver, StudioLocators.slideFooter(androidDriver), "LEFT", testReport);
		Thread.sleep(1000);
		ActionImplementation.getText(StudioLocators.footerInfo(androidDriver), testReport);
		
		ActionImplementation.swipe(androidDriver, StudioLocators.slideFooter(androidDriver), "LEFT", testReport);
		Thread.sleep(1000);
		ActionImplementation.getText(StudioLocators.footerInfo(androidDriver), testReport);
		
		Thread.sleep(1000);
		
		ActionImplementation.click(StudioLocators.closebadgeButton(androidDriver),testReport,"closebadgeButton");
		
		
	}

}
