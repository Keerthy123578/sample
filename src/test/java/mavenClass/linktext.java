package mavenClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linktext {public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("mobiles");
	String text=search.getAttribute("value");
	System.out.println(text);
	
}
	

}
