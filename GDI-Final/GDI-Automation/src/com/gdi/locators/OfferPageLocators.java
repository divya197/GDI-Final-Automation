package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class OfferPageLocators {
	
	public static String offerSorryPageWait(){
		return "//android.widget.TextView[@text='Your next offer is just a badge away!']";	
	}
	

	public static WebElement startShoppingButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("start_shopping");
		
	}
	public static WebElement offerSorryPage(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Your next offer is just a badge away!']"));
		
	}
}
