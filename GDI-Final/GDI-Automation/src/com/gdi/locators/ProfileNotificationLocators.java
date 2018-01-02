package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ProfileNotificationLocators {

	public static String offerTextWait(AndroidDriver androidDriver){
		return "//android.widget.TextView[@text='10% OF ONE PURCHASE LOY17PROFIL10']";
	}

	public static WebElement shopBannerNotification(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='You Have 1 New Offer']"));
	}
	
	public static WebElement offerNotification(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='10% OF ONE PURCHASE LOY17PROFIL10']"));
	}
	
	
}
