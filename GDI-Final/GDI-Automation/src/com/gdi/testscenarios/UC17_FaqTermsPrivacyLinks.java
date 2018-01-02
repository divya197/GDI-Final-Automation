package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.LoginPageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC17_FaqTermsPrivacyLinks {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC17_FaqTermsPrivacyLinks(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		faqTermsPrivacyLinks();
	}
	
	public static void faqTermsPrivacyLinks() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.verifyPresenceOfElement(HomePageLocators.faq(androidDriver), "FAQ", testReport);
		ActionImplementation.verifyPresenceOfElement(HomePageLocators.termsAndConditions(androidDriver),"TermsAndConditions",testReport);
		ActionImplementation.verifyPresenceOfElement(HomePageLocators.privacy(androidDriver),"Privacy",testReport);
		
	}
}
