package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome = true, dryRun = false, strict = true, 
plugin = {"html:Report/Cucumber_Report", "pretty", "json:Report/Cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"})

public class RunnerClass {

	public static WebDriver driver;               // null driver

	@BeforeClass                             //j-unit
	public static void setUp() {
    System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

	}
     @AfterClass
	public static void tearDown() {
		driver.close();
	}

}
