package com.demopackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monis\\eclipse-workspace\\Selenuim\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382354470&hvpos=&hvnetw=g&hvrand=14522812123497723884&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302160&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=CjwKCAjw79iaBhAJEiwAPYwoCA2uadJ2XRqtlYelGy9E7_BmZGESYODF-xGrBe68wZGiYybhYD27kBoCYVcQAvD_BwE");
        
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@dir='auto']"));
		search.sendKeys("wisley laptop bags");
		WebElement go = driver.findElement(By.xpath("//input[@value='Go']"));
		go.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\monis\\eclipse-workspace\\Selenuim\\Screenshot\\im.png");
		FileUtils.copyFile(from, to);
		
	}

}
