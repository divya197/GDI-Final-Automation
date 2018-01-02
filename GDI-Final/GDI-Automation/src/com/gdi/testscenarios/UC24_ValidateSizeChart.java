package com.gdi.testscenarios;

import com.gdi.locators.PDPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC24_ValidateSizeChart {


	private static AndroidDriver androidDriver;
    private static ExtentTest testReport;

	public UC24_ValidateSizeChart(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		validateSizeChart();
	}
	
	public static void validateSizeChart() throws InterruptedException{	
		
		ActionImplementation.click(PDPLocators.infoButton(androidDriver), testReport, "infoButton");
		ActionImplementation.wait(androidDriver, PDPLocators.descriptionWait(), testReport);
		ActionImplementation.click(PDPLocators.viewSizeChartLink(androidDriver), testReport, "viewSizeChart");
		Thread.sleep(5000);
		ActionImplementation.verifyPresenceOfElement(PDPLocators.SizeChart(androidDriver),"SizeChart", testReport);
		
		ActionImplementation.click(PDPLocators.closeSizeChartWindow(androidDriver), testReport, "closeSizeChartWindow");
		Thread.sleep(3000);
		ActionImplementation.click(PDPLocators.closeDescriptionWindow(androidDriver),testReport, "closeDescriptionWindow");
		Thread.sleep(3000);
		
	}
	
}
