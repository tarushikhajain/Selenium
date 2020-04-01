package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
	    Select obj = new Select(driver.findElement(By.id("date")));
		obj.selectByValue("28");		
	}

}
