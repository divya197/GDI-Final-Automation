package com.gdi.locators;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class landingPageLocators {
	
	public static String letsDoThisWait(){
		return "//android.widget.TextView[@text='GOT PROMO FOMO?']";
	}
	
	public static String findMeWait(){
		return "//android.widget.TextView[@text='STAY AHEAD OF THE GAME']";
	}
	public static String allowWait(){
		return "//android.widget.TextView[@text='allow']";
	}
}
