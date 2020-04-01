package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:\\www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("tarushikha.jain@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.id("loginbutton")).click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.navigate().to("https://www.google.co.in");
	String srsTitle = driver.getTitle();
	String actualTitle= driver.getTitle();
	System.out.println(driver.getTitle());
	if (srsTitle.equals(actualTitle))
		System.out.println("Testcase pass");
	else
		System.out.println("Testcase failed");
}
}