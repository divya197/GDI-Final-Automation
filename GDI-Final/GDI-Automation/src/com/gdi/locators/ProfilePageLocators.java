package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ProfilePageLocators {
	
	public static String customerIdTabWait(){
		return "profile_customer_id_screen";
	}

	public static String orderHistoryTabWait(){
		return "profile_order_history_screen";
	}
	
	public static String personalInfoTabWait(){
		return "profile_personal_info_screen";
	}
	
	public static String logOutOKButtonWait(){
		return "android:id/button1";
	}
	
	
	
	
	 //WebElements
	public static WebElement myProfileButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("homeScreen_tab_profile");
	}
	
	public static WebElement customerIdTab(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_customer_id_screen");
	}
	
	public static WebElement orderHistoryTab(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_order_history_screen");
	}
	
	public static WebElement personalInfoTab(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_personal_info_screen");
	}
	
	public static WebElement paymentInfoTab(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_payment_info_screen");
	}
	
	public static WebElement logOutButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_logout");
	}
	
	public static WebElement logOutOKButton(AndroidDriver androidDriver){
		return androidDriver.findElementById("android:id/button1");
	}
	
	public static WebElement savedName(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Test user']"));
	}
	
	public static WebElement setting(AndroidDriver androidDriver){
		return androidDriver.findElement(By.className("android.widget.FrameLayout")).findElements(By.className("android.view.ViewGroup")).get(4);
	}
	public static WebElement closeSettingbutton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationbar_modal_close");
	}
	public static WebElement tagScan(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_tag");
	}
	
	public static WebElement firstName(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_first_name_input");
	}
	
	public static WebElement lastName(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_last_name_input");
	}
	
	public static WebElement phoneNumber(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_phone_input");
	}
	
	public static WebElement forgotPasswordLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("forgot_password");
	}
	public static WebElement birthdayLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("birthday");
	}
	public static WebElement birthdayOKButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
	}
	public static WebElement editAddressButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_edit_address");
	}
	public static WebElement closeEditAddressButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart");
	}
	
	public static WebElement removeAddressButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_remove_address");
	}
	
	public static WebElement undoButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_undo_remove_address");
	}
	
	public static WebElement addNewAddreesLink(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_add_new_address");
	}
	public static WebElement francais(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_english_radio_button");
	}
	public static WebElement updateProfile(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("profile_update_profile");
	}
}
