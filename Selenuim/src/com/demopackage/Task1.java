package com.demopackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monis\\eclipse-workspace\\Selenuim\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=15106035903513479708&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302160&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=Cj0KCQjwqoibBhDUARIsAH2OpWjUTlVZELQqi3v0hf8qGueCHxO4A2N_sN0T_kakUPMoqEa8QBiyoE0aAmsoEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		a.contextClick(best).build().perform();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement today = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		a.contextClick(today).build().perform();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement customer = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		a.contextClick(customer).build().perform();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

		
		
	}

}
