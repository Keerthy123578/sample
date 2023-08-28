package mavenClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeOptions c=new ChromeOptions();
		c.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.amazon.in/");
		String url=driver.getTitle();
		System.out.println(url);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement mobile=driver.findElement(By.xpath("//*[text()='Mobiles']"));
		act.moveToElement(mobile).perform();
		Thread.sleep(4000);	
		
		driver.quit(); 

	}

}
