package DemoPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void screenshot(WebDriver driver, String screenshotName)
	{
		try {
			TakesScreenshot take=(TakesScreenshot)driver;
			File file= take.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("./screenshot"+screenshotName+".png"));
			System.out.println("screenshot Taken");
		}
		catch(Exception e)
		{
			System.out.println("screenshot not taken");
		}
	}
}
