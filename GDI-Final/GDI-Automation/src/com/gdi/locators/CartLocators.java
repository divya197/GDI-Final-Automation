package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CartLocators {
	
	
	
	public static String OopsMessageWait(){
		return "//android.widget.TextView[@text='OOPS.']";
	}
	public static String YourShoppingbagWait(){
		return "//android.widget.TextView[@text='Your shopping bag']";
	}
	public static String saveSelectShippingWait(){
		return "//android.widget.TextView[@text='Where Can We Ship Your Order?']";
	}
	public static String selectPaymentWait(){
		return "//android.widget.TextView[@text='SELECT YOUR SHIPPING METHOD']";
	}
	public static String addCreditCardWait(){
		return "//android.widget.TextView[@text='PLEASE SELECT A PAYMENT OPTION']";
	}
	public static String keepShoppingWait(){
		return "//android.widget.TextView[@text='KEEP SHOPPING']";
	}
	public static WebElement emptyBag(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("empty_screen");
	}
	
	public static WebElement weHandpickedMessage(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("recommended_items");
	}
	
    public static WebElement backButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("navigationbar_back_button");
	}
    
    public static WebElement editQuantity(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_button_counter");
	}
    public static WebElement plusButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_increase_item_quantity");
	}
    public static WebElement closeEditButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_close_edit_menu");
	}
    
    public static WebElement removeProductCloseButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_item_close_icon");
	}
    public static WebElement removeFromBagButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("remove_item");
	}
    public static WebElement editImage(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("edit_wishlist_item");
	}
    public static WebElement checkOutButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_checkout");
	}
    public static WebElement saveSelectShipping(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_checkout");
	}
    public static WebElement selectPayment(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_checkout");
	}
    public static WebElement addCreditCardImage(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("payment_credit_card");
    	//return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='ADD CREDIT CARD']"));
	}
    public static WebElement enterCreditCardNumber(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("add_credit_card_cardnumber");
	}
    public static WebElement enterMonthYear(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("monthly_year_field");
	}
    public static WebElement enterCVV(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cvv_field");
	}
    public static WebElement unCheckSaveCreditCard(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("save_credit_card_details");
	}
    public static WebElement saveCreditCardButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("save_credit_card");
	}
    public static WebElement placeYourOrderButton(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_checkout");
	}
    public static WebElement applyProfileCoupon(AndroidDriver androidDriver){
	    return androidDriver.findElementByAccessibilityId("cart_screen_coupon_item");
	}  
    public static WebElement billingAddressStaticText(AndroidDriver androidDriver){
     	return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Billing Address']"));
 	}
    public static WebElement continueshopping(AndroidDriver androidDriver){
     	return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='KEEP SHOPPING']"));
 	}
}