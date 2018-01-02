package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.locators.SearchLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC62_SerachByKeyword {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC62_SerachByKeyword(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		serachByKeyword();
	}
	
	public static void serachByKeyword() throws InterruptedException{
	
	Thread.sleep(6000);
	
	ActionImplementation.sendKeys(SearchLocators.enterTextInSerach(androidDriver), "Top", testReport);
	Thread.sleep(15000);
	ActionImplementation.click(SearchLocators.selectFromSerarchBox(androidDriver), testReport, "selectFromSerarchBox");
	Thread.sleep(15000);
	
	ActionImplementation.getText(SearchLocators.productName(androidDriver), testReport);
	Thread.sleep(1000);
	ActionImplementation.click(SearchLocators.backButton(androidDriver), testReport, "backButton");
	Thread.sleep(4000);
	ActionImplementation.click(SearchLocators.closeSerachButton(androidDriver), testReport, "closeSerachButton");
	Thread.sleep(3000);
	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]
	
	
	}
	

}
