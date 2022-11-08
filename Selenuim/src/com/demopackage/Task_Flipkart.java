package com.demopackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_Flipkart {

	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monis\\eclipse-workspace\\Selenuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); // https://www.flipkart.com/
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l')]")).click();
	}

	public static void getWindow() {

		WebElement findElement = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		Actions a = new Actions(driver);
		a.dr
	}

	public static void main(String[] args) {
		browserLaunch();
		getWindow();

	}

}
