package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotdemo {
	@Test
	public static void tc1() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)(driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File Target=new File("E:\\Selenium\\Screenshot");
		//FileUtils.copyFile(src, Target);
		FileUtils.copyFileToDirectory(src, Target);
	//	ts.c
		
	

	}
	

}
