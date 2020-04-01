package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E.\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new HtmlUnitDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.cromacampus.co.in"); 
		System.out.println(driver.getTitle());

	}

}
