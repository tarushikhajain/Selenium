package SuitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforeandaftertestdemo {

	WebDriver driver;
	@BeforeTest
	public void browserLaunched() {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void refreshAndClose() {
		
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
	
	@AfterTest
	public void browserClose() {
		driver.close();
	}
	
	@Test
	public void testcase1() {
		driver.findElement(By.id("email")).sendKeys("tarushikha.jain@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("environment");
		driver.findElement(By.id("loginbutton")).click();
	}
	}

