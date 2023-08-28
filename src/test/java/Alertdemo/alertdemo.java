package Alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertdemo {
	@Test
	private void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
    	


//		WebElement simpleAlert=driver.findElement(By.id("alertButton"));
//		simpleAlert.click();
//		a.accept();
//		String alert=simpleAlert.getText();
//		System.out.println(alert);
//		WebElement timerAlertButton=driver.findElement(By.id("timerAlertButton"));
//		timerAlertButton.click();
//		
//		Thread.sleep(5000);
//		a.accept();
//		String alert2=timerAlertButton.getText();
//		System.out.println(alert2);
//		WebElement confirmButton=driver.findElement(By.id("confirmButton"));
//		confirmButton.click();
//		
//		a.accept();
//		String alert3=confirmButton.getText();
//		System.out.println(alert3);
//		Thread.sleep(20000);
	//	Alert b=driver.switchTo().alert();
		WebElement promtButton=driver.findElement(By.xpath("//*[text()='Click me']"));
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", promtButton);
		promtButton.click();
		a.sendKeys("keerthy");
		Thread.sleep(20000);
		a.accept();
		String al3=promtButton.getText();
		System.out.println(al3);
		
	}
	

}
