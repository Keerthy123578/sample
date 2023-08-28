package mavenClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		//Thread.sleep(2000);
		Select s=new Select(date);
		//s.selectByIndex(4);
		Thread.sleep(10000);
		s.selectByValue("4");
		driver.quit();

	}

}

