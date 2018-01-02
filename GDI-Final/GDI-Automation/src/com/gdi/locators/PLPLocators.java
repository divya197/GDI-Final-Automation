package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class PLPLocators {
	
	
	public static WebElement navigateFirstSubCategory(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("tab_bar_items").findElement(By.className("android.widget.HorizontalScrollView"))
				.findElements(By.className("android.view.ViewGroup")).get(1);

	}
	public static WebElement navigateSecondSubCategory(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("tab_bar_items").findElement(By.className("android.widget.HorizontalScrollView"))
				.findElements(By.className("android.view.ViewGroup")).get(2);
	}
	public static WebElement navigateThirdSubCategory(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("tab_bar_items").findElement(By.className("android.widget.HorizontalScrollView"))
				.findElements(By.className("android.view.ViewGroup")).get(3);
	}
	public static WebElement firstSubCategoryProduct(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("sub_category_container").findElement(By.className("android.widget.ScrollView"))
				.findElements(By.className("android.view.ViewGroup")).get(0);
	}
	public static WebElement secondSubCategoryProduct(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("sub_category_container").findElement(By.className("android.widget.ScrollView"))
				.findElements(By.className("android.view.ViewGroup")).get(1);
	}
	
	public static WebElement backButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");
	}
	
	public static String findYourfavsWait(AndroidDriver androidDriver){
		return "//android.widget.TextView[@text='Find your faves']";
	}
	public static WebElement filterButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("filter_button");
	}
	
	public static WebElement priceHighToLow(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("filter_price_high_to_low");
	}
	public static WebElement sizeXS(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_XS");
	}
	public static WebElement sizeS(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_S");
	}
	public static WebElement sizeM(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_M");
	}
	public static WebElement filterResults(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("filter_results");
	}
}
