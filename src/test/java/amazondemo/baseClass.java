package amazondemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static WebDriver driver;

	public static void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void click(WebElement ref) {
		ref.click();

	}

	public static void SendValue(WebElement ref, String value) {

		ref.sendKeys(value);
	}

	public static void Scrollinto(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}

	public static void CaptureScreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\\\Selenium\\\\Screenshot");
		FileUtils.copyFileToDirectory(src, destination);
		

	}
	public static void quit() {
		driver.quit();

	}

}
