package DemoPackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiedemo {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    Set<Cookie> allCookie =driver.manage().getCookies();
    System.out.println("allcookies are" + allCookie.size());
    driver.manage().deleteAllCookies();
    Set<Cookie> allcookies =driver.manage().getCookies();
    System.out.println("After deletion of all cookies");
    System.out.println("allcookies are :=" + allcookies.size());
	}

}

