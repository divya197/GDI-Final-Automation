package com.gdi.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class PDPLocators {
	
	public static String sizeText(){
		return "//android.widget.TextView[@text='SIZE']";
	}
	public static String descriptionWait(){
		return "//android.widget.TextView[@text='DESCRIPTION']";
	}
	public static String findInStoreWait(){
		return "//android.widget.TextView[@text='FIND IT IN-STORE']";
	}
	
	
	
// WebElements
	public static WebElement productImage(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("product_image");	
	}
	
	public static WebElement textPrice(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("product_price").findElement(By.className("android.widget.TextView"));
	}
	public static WebElement sendShare(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("share_button");	
	}
	
	public static WebElement size(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_button");	
	}
	public static WebElement sizePanel(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_button");	
	}
	public static List<WebElement> selectSizeList(AndroidDriver androidDriver){
		return androidDriver.findElement(By.className("android.widget.HorizontalScrollView")).
				findElements(By.className("android.view.ViewGroup"));
	}
	
	
	public static WebElement sizeSelect(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='XS']"));
	}
	
	public static WebElement addTobag(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("add_to_bag_button");	
	}
	public static WebElement saveToWishlist(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("add_to_wish_list_button");	
	}
	
	public static WebElement findInStore(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("find_in_store");	
	}
	
	public static WebElement infoButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("info_button");	
	}
	public static WebElement viewSizeChartLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("view_size_chart");	
	}
	public static WebElement SizeChart(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Size Charts']"));
	}
	public static WebElement closeSizeChartWindow(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");	
	}
	public static WebElement closeDescriptionWindow(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");	
	}
	public static WebElement description(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("description");	
	}
	public static WebElement bagQuantity(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart").findElement(By.className("android.view.ViewGroup")).findElement(By.className("android.widget.TextView"));
	}
	public static WebElement sizeXS(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("size_XS");		
	}
}