package com.demopackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static WebDriver driver;
	public static int totalNumberofProducts;
	public static int minPrice;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monis\\eclipse-workspace\\Selenuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
	}

	public static void totalProducts() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//li[@class='product-base']"));
		totalNumberofProducts = allProducts.size();
		System.out.println("Total count of Products is: " + totalNumberofProducts);
	}

	public static void minimumPriceOfAllProducts() {
		List<Integer> priceList = new ArrayList<Integer>();
		List<WebElement> allProductPrices = driver.findElements(By.xpath(
				"//li[@class='product-base']//descendant::div[@class='product-price']//span[@class='product-discountedPrice']"));
		for (WebElement price : allProductPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			int priceValue = Integer.parseInt(priceText);
			priceList.add(priceValue);
		}
		minPrice = Collections.min(priceList);
		System.out.println("Minimum Price of all Products is: " + minPrice);
	}

	public static void minimumPriceProductName(int Price) {
		WebElement minimumPriceProductName = driver
				.findElement(By.xpath("//span[text()="+Price+"]//ancestor::div[@class='product-price']//preceding-sibling::h3[@class='product-brand']"));
		String brandName = minimumPriceProductName.getText();
		System.out.println("This is the MinimumPriceProduct name: " + brandName);
	}

	public static void main(String[] args) {
		browserLaunch();
		totalProducts();
		minimumPriceOfAllProducts();
		minimumPriceProductName(minPrice);
	 

}
}