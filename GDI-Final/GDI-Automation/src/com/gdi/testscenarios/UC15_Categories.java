package com.gdi.testscenarios;

import org.openqa.selenium.By;

import com.gdi.locators.CartLocators;
import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.gdi.locators.PLPLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class UC15_Categories {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC15_Categories(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		categories();
	}
	
	public static void categories() throws InterruptedException{
		
		ActionImplementation.wait(androidDriver, HomePageLocators.shopWait(), testReport);
		ActionImplementation.click(HomePageLocators.shopModule(androidDriver), testReport,"shopModule");
		Thread.sleep(4000);
		
		//TOPS
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.tops(androidDriver), testReport,"TOPS");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "TOPS");
		Thread.sleep(2000);
		

		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.jeans(androidDriver), testReport,"JEANS");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "JEANS");

		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.bottoms(androidDriver), testReport,"BOTTOMS");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "BOTTOMS");
		
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.jackets(androidDriver), testReport,"JACKETS");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "JACKETS");

		Thread.sleep(2000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(HomePageLocators.dressesAndRompers(androidDriver), testReport,"DRESSESandROMPERS");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "DRESSSESandROMPERS");
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.undies(androidDriver), testReport,"UNDIES");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "UNDIES");
		
		Thread.sleep(2000);
		ActionImplementation.scrollScreen(androidDriver, testReport);
		Thread.sleep(1000);
		ActionImplementation.click(HomePageLocators.sleep(androidDriver), testReport,"SLEEP");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "SLEEP");
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.accessories(androidDriver), testReport,"ACCESSORIES");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "ACCESSORIES");
		
		Thread.sleep(2000);
		ActionImplementation.click(HomePageLocators.sale(androidDriver), testReport,"SALE");
		Thread.sleep(12000);
		ActionImplementation.isPresent(androidDriver, testReport, "SALE");
		Thread.sleep(2000);
	}
}
