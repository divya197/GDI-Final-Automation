package com.gdi.useractions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.PDPLocators;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class ActionImplementation {
	
	public static String userID;
	
	public static void click(WebElement ele, ExtentTest testReport, String input){
		try{
			ele.click();
			testReport.log(LogStatus.PASS, "Successfully clicked on " +input+ " the button");	
		}
		catch(Exception e){
			testReport.log(LogStatus.FAIL, "Failed to click on" + input + " button");	
		}
	}
	
	public static void sendKeys(WebElement ele, String keys, ExtentTest testReport){
		try{
			ele.sendKeys(keys);
			testReport.log(LogStatus.PASS, "Successfully entered on the key= "+keys);	
		}
		catch(Exception e){
			testReport.log(LogStatus.FAIL, "Failed to enter the key= "+ keys);	
		}
	}
	
	public static void getText(WebElement ele,ExtentTest testReport){
		try{
			String str=ele.getText();
			testReport.log(LogStatus.PASS, "Successfully captured the text=" + str );	
		}
		catch(Exception e){
			testReport.log(LogStatus.FAIL, "Failed to  captured the text");	
		}
	}
	
//	public static void androidBack(AndroidDriver androidDriver, ExtentTest testReport){
//		try{
//
//			androidDriver.pressKeyCode(AndroidKeyCode.BACK);
//			testReport.log(LogStatus.PASS, "Successfully entered on the key");	
//		}
//		catch(Exception e){
//			testReport.log(LogStatus.FAIL, "DIDNT enter the key");	
//		}
//	}
//	
	
	
	
	public static void wait(AndroidDriver AndroidDriver, String xpath, ExtentTest testReport){
		try{
			
			WebDriverWait wait = new WebDriverWait(AndroidDriver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			testReport.log(LogStatus.PASS, "element present");	
		}
		catch(Exception e){
			testReport.log(LogStatus.FAIL, "element not present");	
		}
	}
	
	
	public static String getUniqueUserName(AndroidDriver driver){
	
			DateFormat dateFormat = new SimpleDateFormat("MMddyyHHmmss");
	  		Date date = new Date();
	  		userID= dateFormat.format(date)+"@test.com";
	  		return  userID;
	
	}
	
	public static void verifyTextOfElement(WebElement ele, String expectedText, ExtentTest testReport){
		
		if(ele.getText().equals(expectedText)){
			testReport.log(LogStatus.PASS, "element text= " + expectedText +"  present");	
		}
		else{
			testReport.log(LogStatus.FAIL, "element text= " + expectedText +" is not present");	
		}

	}
	
	public static boolean verifyPresenceOfElement(WebElement ele, String input,ExtentTest testReport){
		
		if(ele.isDisplayed()){
			testReport.log(LogStatus.PASS, "element is present : " + input );
			return true;
		}
		else{
			testReport.log(LogStatus.PASS, "element is not present : "+ input);	
			return false;
		}

	}
	
	public static void scrollScreen(AndroidDriver androidDriver, ExtentTest testReport) 
	{
		try 
		{
			Dimension size = androidDriver.manage().window().getSize();
		    System.out.println(size);
		     
		    //Find swipe start and end point from screen's with and height.
		    //Find starty point which is at bottom side of screen.
		    int starty = (int) (size.height * 0.80);
		    //Find endy point which is at top side of screen.
		    int endy = (int) (size.height * 0.20);
		    //Find horizontal point where you wants to swipe. It is in middle of screen width.
		    int startx = size.width / 2;
		    System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		    //Swipe from Bottom to Top.
		    androidDriver.swipe(startx, starty, startx, endy, 3000);
		    //Thread.sleep(2000);

		}
		catch (Exception e) 
		{
			e.printStackTrace();
			testReport.log(LogStatus.FAIL, "Failed to Scroll");
			return;
		}
		
		testReport.log(LogStatus.PASS, "Scrolled successfully");
	}
	

	
	public static void swipe(AndroidDriver androidDriver,WebElement ele,String swipeType,ExtentTest testReport)
	{
		try
		{
			MobileElement mb1=(MobileElement) ele;
			if(swipeType.equalsIgnoreCase("UP"))
				
				mb1.swipe(SwipeElementDirection.UP, 2000);
			if(swipeType.equalsIgnoreCase("DOWN"))
				mb1.swipe(SwipeElementDirection.DOWN, 2000);
			if(swipeType.equalsIgnoreCase("LEFT"))
				mb1.swipe(SwipeElementDirection.LEFT, 6000);
			if(swipeType.equalsIgnoreCase("RIGHT"))
				mb1.swipe(SwipeElementDirection.RIGHT, 2000);   
		 }
		
		catch ( Exception e)
		{
			e.printStackTrace();
			testReport.log(LogStatus.FAIL, "Failed to SWIPE to" + swipeType);
			return;
		}
		
		testReport.log(LogStatus.PASS, "Successfully Swiped to" + swipeType);	
	}
	
	
	public static void scrollTo(AndroidDriver androidDriver, String input,ExtentTest testReport){
		try{
			androidDriver.scrollTo(input).click();
			testReport.log(LogStatus.PASS, "Successfully scrolled to "+input+"and clicked on the button");	
		}
		catch(Exception e){
			testReport.log(LogStatus.FAIL, "DIDNT scrolled to" + input);	
		}
	}
	
	
	public static void navigateBackFromPDPtoShop(AndroidDriver androidDriver, ExtentTest testReport){
		try{
		
			ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
			Thread.sleep(1000);
			ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
			testReport.log(LogStatus.PASS, "Successfully navigated back");	
		   }
		 catch(Exception e){
			testReport.log(LogStatus.FAIL, "Failed to navigate  back");	
		 }
	
      }
	
	public static void SizeSelection(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{

	    		next:  for(int i=1;i<=5;i++){
	    			  Thread.sleep(1000);
	    			  ActionImplementation.click(PDPLocators.sizePanel(androidDriver), testReport,"sizePanel");
	    		      Thread.sleep(1000);
	    	    	  System.out.println("try"+i);
	    	    	  androidDriver.findElementByAccessibilityId("size_options_swiper").
	    	    	  findElement(By.className("android.widget.HorizontalScrollView")).findElements(By.className("android.view.ViewGroup")).get(i).click();
	    			  System.out.println("after try"+i);
	    			try{
	    				boolean result=androidDriver.findElementByAccessibilityId("add_to_bag_button").isDisplayed();
	    				if(result){
	    				String AddToBag=androidDriver.findElementByAccessibilityId("add_to_bag_button").
	    					  findElement(By.className("android.view.ViewGroup")).findElement(By.className("android.widget.TextView")).getText();
	    				System.out.println("Entered tryy");
	    				System.out.println("String is "+AddToBag);
	    				Thread.sleep(5000);
	    			  
	    			  
	    			  if(AddToBag.equals("ADD TO BAG"))
	    			  {
	    				  Thread.sleep(3000);
	    				  System.out.println("excecuting if");
	    				  break;
	    			  }

	    			 }
	    			}
	    			catch(Exception e){
	    				System.out.println("excecuting else");
	    				Thread.sleep(4000);
	    				continue next;
	    			}
	    		}
	    			  
		   }
	
	public static void isPresent(AndroidDriver androidDriver, ExtentTest testReport, String input){
		
		try{
			boolean status = androidDriver.findElementByAccessibilityId("sub_category_container").isDisplayed();
			if(status){
			
			ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
			testReport.log(LogStatus.PASS, "Product sub-categories for " +input + " are present");	
			}
		}
			catch(Exception e){
				testReport.log(LogStatus.FAIL, "Product sub-categories for " + input + " are not present");	
			ActionImplementation.click(HomePageLocators.backButton(androidDriver), testReport,"backButton");
			
			}
			}
		}
		
	
