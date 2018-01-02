//package com.gdi.testexecutor;
//
//import java.net.MalformedURLException;
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//
//import com.gdi.helpers.Property;
//import com.gdi.testscenarios.TestScenarioMapper;
//
//import java.net.URL;
//;public class TestExecutor extends BaseDriver
//{
//
//public  String data;
//
//
//@BeforeClass
//public void launchApp() throws MalformedURLException
//{   
////	DesiredCapabilities cap= new DesiredCapabilities();
////	cap.setCapability(MobileCapabilityType.APP, "C://Users//sandeepraju//Documents//GDI-Automation//GDI-Automation//Applications//app-v121-dynamite-ca-client_qa.apk");
////	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
////	cap.setCapability("automationName", "uiautomator2");
////	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,Property.getPropertyValue(PathDefiner.configPath, "version"));
////	cap.setCapability(MobileCapabilityType.DEVICE_NAME,Property.getPropertyValue(PathDefiner.configPath, "device_Name"));
////	androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4725/wd/hub"),cap);
////	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
//////	androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	DesiredCapabilities capabilities = new DesiredCapabilities();
//
//	/*  1. Choose your project */
//	capabilities.setCapability("testobject_api_key", "E0E79F012DDB42179963C688F8DE0593");
//
//	/*  2. Select your testing device:
//	*   Specify a `platformVersion` without `deviceName` to get any available device with that platform version.
//	*   Not selecting a device at all is also a valid choice, we will select it carefully for you */
//	capabilities.setCapability("platformVersion", "8.0.0"); // Optional
//	capabilities.setCapability("deviceName", "LG_Nexus_5X_free"); // Optional
//	capabilities.setCapability("testobject_app_id ", "3");
//	/*  3. Where is your device located? */
//	//URL EU_endpoint = new URL("https://eu1.appium.testobject.com/wd/hub");
//	URL US_endpoint = new URL("https://us1.appium.testobject.com/wd/hub");
//
//	/*  The driver will take care of establishing the connection, so we must provide
//	*  it with the correct endpoint and the requested capabilities. */
//	androidDriver = new AndroidDriver(US_endpoint, capabilities);
//	//androidDriver = new AndroidDriver(EU_endpoint, capabilities);
//}
//
//
//@Test(dataProvider="getScenarios")
//public void testScenarios(String scenarioName, String executionStatus) throws InterruptedException
//{   
//	testReport=eReport.startTest(scenarioName);
//	if(executionStatus.equalsIgnoreCase("yes"))
//	{
//		TestScenarioMapper.executeFunction(scenarioName, androidDriver, testReport);
//	}
//}
//
//}



package com.gdi.testexecutor;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import com.gdi.helpers.Property;
import com.gdi.testscenarios.TestScenarioMapper;

import java.net.URL;
public class TestExecutor extends BaseDriver
{

public  String data;


@BeforeClass
public void launchApp() throws MalformedURLException
{   
	
//	File appDir=new File("Applications");
//	File app= new File(appDir,"app-v141-garage-ca-internal_qak");
	
	DesiredCapabilities cap= new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	cap.setCapability(MobileCapabilityType.APP, "/Users/testuser/Downloads/app-v141-garage-ca-internal_qa.apk");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	cap.setCapability("automationName", "uiautomator2");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,Property.getPropertyValue(PathDefiner.configPath, "version"));
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,Property.getPropertyValue(PathDefiner.configPath, "device_Name"));
	androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
//	androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


@Test(dataProvider="getScenarios")
public void testScenarios(String scenarioName, String executionStatus) throws InterruptedException
{   
//	androidDriver.findElementById("android:id/checkbox").click();
//	Thread.sleep(1000);
//	androidDriver.findElementByAccessibilityId("Back").click();
	testReport=eReport.startTest(scenarioName);
	if(executionStatus.equalsIgnoreCase("yes"))
	{
		TestScenarioMapper.executeFunction(scenarioName, androidDriver, testReport);
	}
}

}

