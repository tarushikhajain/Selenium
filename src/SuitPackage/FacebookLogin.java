package SuitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {

	WebDriver driver;
	@Test(priority = 1)
	public void btestcase1() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tarushikha.jain@gmail.com");
	}

	@Test(priority = 2)
	public void ctestcase2() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tarushikha93@gmail.com");
	}
	
	@Test(priority = 3)
	public void atestcase3() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("akjain.dvc@gmail.com");
	}
}
