package DemoPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdemo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver","E:\\Software Testing\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");

	}

}
