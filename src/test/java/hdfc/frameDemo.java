package hdfc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		List <WebElement> countOfFrame=driver.findElements(By.tagName("iframe"));
		int count=countOfFrame.size();
		System.out.println(count);
		WebElement frame=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		driver.findElement(By.id("selectnav1")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("keerthy");

		
		

	}

}
