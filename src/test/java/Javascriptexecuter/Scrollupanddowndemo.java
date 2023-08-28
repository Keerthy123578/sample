package Javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Scrollupanddowndemo {
	@Test
	private void tc1() throws InterruptedException {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Careers']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		Thread.sleep(5000);
		WebElement scrollup = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);

	}

}
