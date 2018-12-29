package Com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void close() {
		driver.close();
	}

}
