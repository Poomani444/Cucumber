import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monis\\eclipse-workspace\\Selenium\\Driver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		
	}

}
