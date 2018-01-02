package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

//"""GDI_TC2>>>>row 9"""
public class CreateNewAccountLocators {
		
	public static String useMyLocationWait(){
		return "//android.widget.TextView[@text='USE MY LOCATION']";	
	}

	public static String allowLocationButtonWait(){
		return "//android.widget.Button[@text='Allow']";
	}
	
	public static String createAccountForWait(){
		return "//android.widget.TextView[@text='Join to earn badges and collect rewards.']";
	}
	public static String accessYourWishlistWait(){
		return "//android.widget.TextView[@text='Access your wishlist, your badges, your rewards, your profile and more by signing in']";
	}
	
	public static String notifyMeWait(){
		return "//android.widget.TextView[@text='NOTIFY ME']";
	}
	
	public static String invalidPasswordCharWait(){
		return "//android.widget.TextView[@text='Password must be at least 6 characters, contain upper and lower case letters and at least 1 number']";
	}
	
	public static String completeProfileWait(){
		return "//android.widget.TextView[@text='Complete Profile']";
	}
	
	public static String letsDiThisWait(){
		return "//android.widget.TextView[@conent-disc='push_notifications']";
	}
	public static String findMeWait(){
		return "//android.widget.TextView[@text='STAY AHEAD OF THE GAME']";
	}
	public static String signInNowWait(){
		return "//android.widget.TextView[@text='SIGN IN NOW']";
	}
	
	
//        WebElements
	
	public static WebElement signInNowButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN NOW']"));
	}
	
	public static WebElement createAccount(AndroidDriver androidDriver){
//		return androidDriver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='loginScreen_createAccountSelectorButton']")).findElements(By.className("android.widget.TextView")).get(0);
		return androidDriver.findElementByAccessibilityId("loginScreen_createAccountSelectorButton");
	}
	
	public static WebElement enterYourEmail(AndroidDriver androidDriver){
		try{
			return androidDriver.findElementByAccessibilityId("loginScreen_emailContainer").findElement(By.className("android.view.ViewGroup")).findElement(By.className("android.widget.EditText"));
		}
		catch(Exception e){
			return androidDriver.findElementByAccessibilityId("loginScreen_emailContainer").findElement(By.className("android.view.View")).findElement(By.className("android.widget.EditText"));	
		}
	}
	
	public static WebElement enterYourPassword(AndroidDriver androidDriver){
		try{
			return androidDriver.findElementByAccessibilityId("loginScreen_passwordContainer").findElements(By.className("android.view.ViewGroup")).get(0).findElement(By.className("android.widget.EditText"));
		}
		catch(Exception e){
			return androidDriver.findElementByAccessibilityId("loginScreen_passwordContainer").findElements(By.className("android.view.View")).get(0).findElement(By.className("android.widget.EditText"));
		}

	}
	
	public static WebElement joinToEarnStaticText(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Join to earn badges and collect rewards.']"));
	}
	
	public static WebElement accessToYourWishlistStaticText(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Access your wishlist, your badges, your rewards, your profile and more by signing in']"));
	}
	public static WebElement letsGoButton(AndroidDriver androidDriver){
		try{
			return androidDriver.findElementByAccessibilityId("loginScreen_loginContainer").findElements(By.className("android.view.ViewGroup")).get(0);
		}
		catch (Exception e) {
			return androidDriver.findElementByAccessibilityId("loginScreen_loginContainer").findElements(By.className("android.view.View")).get(0);
		}
	}
	
	public static WebElement letsDoThis(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("push_notifications");
	}
	
	public static WebElement findMe(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("enable_geolocation");
	}
	
	public static WebElement allow(AndroidDriver androidDriver){
		return androidDriver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	}
	
	public static WebElement notifyMeButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='NOTIFY ME']"));
	}
	
	public static WebElement useMyLocationButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='USE MY LOCATION']"));
	}
	
	public static WebElement allowLocationButton(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));
	}
	
	public static WebElement temsAndConditions(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("loginScreen_forgotPasswordContainer").findElement(By.className("android.widget.TextView"));
	}
	
	public static WebElement invalidPasswordChar(AndroidDriver androidDriver){
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Password must be at least 6 characters, contain upper and lower case letters and at least 1 number']"));
	}
	
	public static WebElement closeProfileButton(AndroidDriver androidDriver){
		return androidDriver.findElementByAccessibilityId("navigationBar_cart");
	}
	
	
}

