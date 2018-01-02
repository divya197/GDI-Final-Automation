package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HomePageLocators {
	
	public static String shopWait(){
		return "//android.widget.TextView[@text='Shop']";
	}
	
	public static String firstCarousalWait(){
		return "";
	}
	
	public static String subCategoryWait(){
		return "";
	}
	
	public static String giftCardPageWait(){
		return "//android.widget.TextView[@text='$50.00']";
	}
	
	
	
	public static WebElement search(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_search");
	}
	
	
	
	public static WebElement tag(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_tag");
	}
	
	public static WebElement storeLocator(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_storeFinder");
	}
	
	public static WebElement shoppingCart(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart");
	}
	
	public static WebElement shopModule(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_shop");
	}
	
	public static WebElement offersModule(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_offers");
	}
		
	public static WebElement studioModule(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_loyalty");
	}
	
	public static WebElement profileModule(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_profile");
	}
	
	public static WebElement wishlistModule(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_wishlist");
	}
	
	public static WebElement firstCarousal(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("hero_swiper").findElement(By.className("android.support.v4.view.ViewPager"))
				.findElement(By.className("android.view.ViewGroup"));
	}
	
	
	public static WebElement secondCarousal(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement thirdCarousal(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement fourthCarousal(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement backButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_back_button");
	}
	

	
	public static WebElement secondSubCategoryCheck(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement thirdSubCategoryCheck(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement fourthSubCategoryCheck(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("");
	}
	
	public static WebElement tops(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("TOPS");
	}

	public static WebElement jeans(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("JEANS");
	}
	
	public static WebElement bottoms(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("BOTTOMS");
	}
	public static WebElement jackets(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("JACKETS");
	}
	public static WebElement dressesAndRompers(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("DRESSES_&_ROMPERS");
	}
	public static WebElement undies(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("UNDIES_&_BRALETTES");
	}
	public static WebElement sleep(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("SLEEP_CA");
	}
	public static WebElement accessories(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("ACCESSORIES");
	}
	public static WebElement sale(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("SALE");	
	}
	public static WebElement giftCard(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("GIFT_CARD");		
	}
	public static WebElement selectGiftCard(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("GIFT_CARD_50");		
	}
	public static WebElement addGiftCardtoCart(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("add_gift_card_to_bag").findElement(By.className("android.view.ViewGroup")).findElement(By.className("android.widget.TextView"));
	}
	
	public static WebElement faq(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("faq");		
	}
	public static WebElement termsAndConditions(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("terms_conditions");		
	}
	public static WebElement privacy(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("privacy");		
	}
	
}


