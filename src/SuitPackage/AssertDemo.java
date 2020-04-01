package SuitPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	WebDriver driver;
	@Test
	public void testCase1() {
		SoftAssert soft = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String actualTitle=driver.getTitle();
		String expectedTitle=driver.getTitle();
		soft.assertEquals(expectedTitle, actualTitle);
		soft.assertAll();
	}
}
