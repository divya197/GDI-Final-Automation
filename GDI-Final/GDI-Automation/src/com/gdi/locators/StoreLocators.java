package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class StoreLocators {
	
	public static String CanadaABwait(){
		return "//android.widget.TextView[@text='AB']";
	}
	public static String CountrySelectionwait(){
		return "//android.widget.TextView[@text='CAN']";
	}
	

	public static WebElement changeCountrySelectionLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("CHANGE_COUNTRY_SELECTION");
	}
	public static WebElement selectCountryCAN(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("CA");
	}
	
	public static WebElement selectProvienceAB(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("AB");
	}
	public static WebElement selectCityCalagry(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("Calgary");
	}
	
	public static WebElement getDirections(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='GET DIRECTIONS']"));
	}
	public static WebElement closeButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");
	}
}
