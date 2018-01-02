package com.gdi.testscenarios;

import org.openqa.selenium.By;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC01_BannerLogoTermsConditions {
	
	//"""GDI_TC1>>>>row 8"""
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC01_BannerLogoTermsConditions(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		verifyBannerLogo_Terms_Conditions();
	}
	
	public static void verifyBannerLogo_Terms_Conditions() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.createAccountForWait(), testReport);
		ActionImplementation.click(CreateNewAccountLocators.createAccount(androidDriver), testReport,"createAccountTab");
		Thread.sleep(5000);
		String expText = "By creating an account I confirm that I've read and accepted the Terms & Conditions of the loyalty program and to receive communication from Groupe Dynamite. Privacy Policy";
		ActionImplementation.verifyTextOfElement(CreateNewAccountLocators.temsAndConditions(androidDriver), expText, testReport);
		String exptext1 = "Join to earn badges and collect rewards.";
		ActionImplementation.verifyTextOfElement(LoginPageLocators.joinToEarnStaticText(androidDriver), exptext1, testReport);
		//ActionImplementation.click(LoginPageLocators.skipforNowLink(androidDriver), testReport, "skipForNow");
		
	}

}
