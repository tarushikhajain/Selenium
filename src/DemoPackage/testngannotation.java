package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testngannotation {
WebDriver driver;
@BeforeMethod
public void browserLaunched()
{
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
@AfterMethod
public void refreshandclose() {
	driver.navigate().back();
	driver.navigate().refresh();
}

@Test
public void TestCase1()
{
	driver.findElement(By.id("email")).sendKeys("tarushikha.jain@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.id("loginbutton")).click();
}

@Test
	public void TestCase2()
	{
	driver.findElement(By.id("email")).sendKeys("gfhjskssbgbdbjd");
	driver.findElement(By.id("pass")).sendKeys("lkjfhfj");
	driver.findElement(By.id("loginbutton")).click();
}
@Test
public void TestCase3()
{
	driver.findElement(By.id("email")).sendKeys("xyts@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("1234567");
	driver.findElement(By.id("loginbutton")).click();
	
	
}


}