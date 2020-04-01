package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}

}
