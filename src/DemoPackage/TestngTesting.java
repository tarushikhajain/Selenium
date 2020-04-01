package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngTesting {

	@Test
	public void testCase1() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tarushikha.jain@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	@Test
	public void testCase2() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	@Test
	public void testCase3() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("yoo@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
}
