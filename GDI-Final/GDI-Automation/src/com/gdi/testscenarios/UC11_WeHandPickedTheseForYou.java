package com.gdi.testscenarios;

import com.gdi.locators.CartLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC11_WeHandPickedTheseForYou {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC11_WeHandPickedTheseForYou(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		weHandPickedTheseForYou();
	}
	
	public static void weHandPickedTheseForYou() throws InterruptedException{
	
		String ExpectedHandPickedMesaage= "We Handpicked These For You";
		ActionImplementation.verifyTextOfElement(CartLocators.weHandpickedMessage(androidDriver),ExpectedHandPickedMesaage , testReport);
		Thread.sleep(1000);
		ActionImplementation.click(CartLocators.backButton(androidDriver), testReport, "BackButton");
		
	
	}
}
