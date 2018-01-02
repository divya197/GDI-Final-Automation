package com.gdi.locators;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class WishlistLocators {
	
	
	
	public static String OopsMessageWait(){
		return "//android.widget.TextView[@text='OOPS.']";
	}
	
	public static WebElement emptyWishlistMessage(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("empty_screen");
	}
	public static WebElement closeProductButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("cart_item_close_icon");
	}
	public static WebElement keepInWishlist(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("keep_item");
	}
	public static WebElement addToBag(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("Add_To_Bag");
	}
	
}
