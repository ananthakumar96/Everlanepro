package com.everlane.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Everlane.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\org", 
glue = "com/stepdefiniton/ste")
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void browserSet() {
		driver = BaseClass1.getDriver("chrome");
	}

	//@AfterClass
	//public static void browserclose() {
		//driver.close();
	}
//}
