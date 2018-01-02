package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class StudioLocators {
	
	public static String MyStudioTitleWait(){
		return "//android.widget.TextView[@text='Collect all 6 badges to reach VIP status and unlock more rewards! SEE REWARDS']";	
	}
	public static String whatIsGarageStudioWait(){
		return "//android.widget.TextView[@text='What is Garage Studio?']";	
	}
	
	public static WebElement MyStudioTitleText(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Collect all 6 badges to reach VIP status and unlock more rewards! SEE REWARDS']"));	
	}
	
	public static WebElement infoHeader(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("info_button");	
	}
	
	public static WebElement whatIsGarageStudioText(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='What is Garage Studio?']"));	
	}

	public static WebElement closeInfoButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_modal_close");	
	}
	public static WebElement localizationHeader(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_storeFinder");	
	}
	public static WebElement cmpleteProfilebadge(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("Complete_Profile");	
	}
	public static WebElement tenPercentOff(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='10% off one purchase']"));	
	}
	public static WebElement buyTwoWaysbadge(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("Buy_2_Ways_new");	
	}
	public static WebElement slideFooter(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("badge_footer");	
	}
	
	public static WebElement footerInfo(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("badge_footer").findElements(By.className("android.widget.TextView")).get(0);
	}
	
	public static WebElement closebadgeButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart");	
	}
	
	public static WebElement seeRewardsLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("see_rewards");	
	}
	public static WebElement rewordsBenifitsTitle(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Rewards & Benefits']"));	
	}
	
	public static WebElement baseBenefits(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("base_benefits");	
	}
	
	public static WebElement vipBenefits(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("vip_benefits");	
	}
	 public static WebElement closeRewardsButton(AndroidDriver androidDriver){
		    return androidDriver.findElementByAccessibilityId("navigationbar_modal_close");
	}
	
	
	
	
	
}
