package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SearchLocators {
	public static WebElement enterTextInSerach(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("search_input");
		}
	public static WebElement test(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("search_input");
	}
	
	
	

	public static WebElement selectFromSerarchBox(AndroidDriver androidDriver){
		//return androidDriver.findElement(By.xpath("//android.widget.EditText[@content-desc='search_input']//following-sibling::android.view.ViewGroup"));
		//return androidDriver.findElement(By.className("android.view.ViewGroup[2]")).findElements(By.className("android.view.ViewGroup")).get(1);
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Crew Neck Semi-Fitted Long Sleeve Top']"));
	}
	
	
	public static WebElement productName(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("product_name");
	}
	
	public static WebElement backButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");
	}
	
	public static WebElement closeSerachButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_modal_close");
		}

}
