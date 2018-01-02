package com.gdi.testscenarios;

import com.gdi.locators.CreateNewAccountLocators;
import com.gdi.locators.ProfilePopUpFieldsLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UC04_CompleteProfileBadgeValidation {
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC04_CompleteProfileBadgeValidation(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		CompleteProfileBadgeValidation();
	}
	public static void CompleteProfileBadgeValidation() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, CreateNewAccountLocators.completeProfileWait(),testReport);
		ActionImplementation.click(ProfilePopUpFieldsLocators.completeProfileButton(androidDriver),testReport,"completeProfileButton");
		Thread.sleep(1000);
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterFirstName(androidDriver), "Test",testReport);
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterLastName(androidDriver), "user",testReport);
		ActionImplementation.click(ProfilePopUpFieldsLocators.firstNameText(androidDriver),testReport,"firstNameText");
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePopUpFieldsLocators.selectBirthday(androidDriver), testReport,"selectBirthday");
		Thread.sleep(1000);
		ActionImplementation.click(ProfilePopUpFieldsLocators.birthdayOKButton(androidDriver), testReport,"birthdayOKButton");
		Thread.sleep(1000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterAdressLine1(androidDriver),"Richmond Circle",testReport);
		ActionImplementation.click(ProfilePopUpFieldsLocators.adressLine1Text(androidDriver),testReport,"adressLine1Text");
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterCity(androidDriver),"Toronto",testReport);
		ActionImplementation.click(ProfilePopUpFieldsLocators.cityText(androidDriver),testReport,"cityText");
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterPostalCode(androidDriver),"M6K3P6",testReport);
		Thread.sleep(2000);
		ActionImplementation.click(ProfilePopUpFieldsLocators.postalCodeText(androidDriver), testReport,"postalCodeText");
		Thread.sleep(2000);
		ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterPhoneNumber(androidDriver),"4123457800",testReport);
		//ActionImplementation.sendKeys(ProfilePopUpFieldsLocators.enterPhoneNumber(androidDriver),"417",testReport);
		ActionImplementation.click(ProfilePopUpFieldsLocators.phoneNumberText(androidDriver),testReport,"phoneNumberText");
		ActionImplementation.click(ProfilePopUpFieldsLocators.saveAddressButton(androidDriver),testReport,"saveAddressButton");
		//ActionImplementation.wait(androidDriver,ProfilePopUpFieldsLocators.completeProfileSuccesWindowWait(),testReport);
		Thread.sleep(10000);
//		ActionImplementation.click(ProfilePopUpFieldsLocators.viewDetail(androidDriver),testReport);
//		Thread.sleep(1000);
		ActionImplementation.click(ProfilePopUpFieldsLocators.completeProfileCloseButton(androidDriver),testReport,"completeProfileCloseButton");
		Thread.sleep(4000);
	}
	
}
