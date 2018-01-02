package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ProfilePopUpFieldsLocators {
	
	public static String completeProfileSuccesWindowWait(){
		return "//android.widget.TextView[@text='COMPLETE PROFILE']";
	}
	
	public static String lastNameTextWait(){
		return "";
	}

	public static WebElement completeProfileButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("onboarding_complete_profile");
	}
	
	public static WebElement enterFirstName(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_first_name_input");
	}
	
	public static WebElement enterLastName(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_last_name_input");
	}
	
	public static WebElement firstNameText(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_first_name_label");
	}
	
	public static WebElement selectBirthday(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_birthday_input");
	}
	
	public static WebElement birthdayOKButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
	}
	
	public static WebElement enterAdressLine1(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_address_line1_input");
	}
	
	public static WebElement adressLine1Text(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_address_line1_label");
	}
	
	public static WebElement enterCity(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_city_input");
	}
	
	public static WebElement cityText(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_city_label");
	}
	
	public static WebElement enterPostalCode(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_zip_code_input");
	}
	
	public static WebElement postalCodeText(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_zip_code_label");
	}
	
	public static WebElement enterPhoneNumber(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_phone_input");
	}
	
	public static WebElement phoneNumberText(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_phone_label");
	}
	
	public static WebElement saveAddressButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("onboarding_complete_profile");
	}
	
	public static WebElement completeProfileSuccesWindow(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='COMPLETE PROFILE']"));
	}
	
	public static WebElement completeProfileCloseButton(AndroidDriver androidDriver){
		return androidDriver.findElements(By.className("android.view.ViewGroup")).get(0);
	}
	
	public static WebElement viewDetail(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart");
    }
}