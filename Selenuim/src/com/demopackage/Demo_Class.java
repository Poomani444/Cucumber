package com.demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monis\\eclipse-workspace\\Selenuim\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.name("email"));
		findElement.sendKeys("poomani444@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("flower@07");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().forward();
		Thread.sleep(5000);

		driver.navigate().refresh();

	}

}
