package com.test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class First_StepDefinition {
	public static AppiumDriver driver;
	@Given("^I want to launch app$")
	public void i_want_to_launch_app() throws Throwable {
		try {
		System.out.println("In launch app");
		File f = new File("C://Users//Madhu N//Downloads//com.nobroker.app_2020-08-13.apk/");
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome ");
		dc.setCapability("deviceName", "HonorPlay");
		dc.setCapability("udid","58H3Y18904006164");
		dc.setCapability("platformName", "android");
		//dc.setCapability("platformVersion", "9");
		dc.setCapability("app", f);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability("appPackage", "com.nobroker.app");
		dc.setCapability("appActivity", "com.nobroker.app.activities.NBLauncherActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Given("^enter some data on search item$")
	public void enter_some_data_on_search_item() throws Throwable {
		System.out.println("In enter some data");
				
	}
}
