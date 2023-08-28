package Javascriptexecuter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class javaScriptexecuterDemo {
	@Test
	private void tc1() throws InterruptedException {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Thread.sleep(2000);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement click = driver.findElement(By.id("login"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//to send value using javascriptexecuter
		js.executeScript("arguments[0].setAttribute('value','keerthy123')", user);

		//to get value using javascriptexecuter like getattaribute method
		Object textuser = js.executeScript("arguments[0].getAttribute('value')", user);
		System.out.println(textuser);
		js.executeScript("arguments[0].setAttribute('value','12345K')", pass);
		
		
		//to clik the button  using javascriptexecuter
		js.executeScript("arguments[0].click()", click);


	}

}
