package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider
	public Object dataSet() {
		
		Object[][] object = new Object [10][2];
		
		object[0][0] ="tarushikha.jain@gmail.com";
		object[0][1] ="abc1234";
		
		object[1][0] ="taru123cool@gmail.com";
		object[1][1] ="abcasdf";
		
		object[2][0] ="abhishek.jain@gmail.com";
		object[2][1] ="abc1231234";
		
		object[3][0] ="rashmicool123@gmail.com";
		object[3][1] ="petabc1234";
		
		object[4][0] ="sanjana.say2me@gmail.com";
		object[4][1] ="abc1234";
		
		object[5][0] ="ankurjain.9@gmail.com";
		object[5][1] ="123456";
		
		object[6][0] ="akjain.dvc@gmail.com";
		object[6][1] ="bcet";
		
		object[7][0] ="suman.ashokjain@gmail.com";
		object[7][1] ="abc1234";
		
		object[8][0] ="kalika.jain@gmail.com";
		object[8][1] ="earth";
		
		object[9][0] ="tarushikha93@gmail.com";
		object[9][1] ="abc1234";
		
		return object;
	}

	@Test(dataProvider = "dataSet")
	public void testcases(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		Utility.screenshot(driver, "facebook");
	}
}

	
	
