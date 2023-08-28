
package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestiondemo {
	@Test
	private void Autosuggestion() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("che");
		Thread.sleep(3000);
		List<WebElement>autosuggestion=driver.findElements(By.xpath("*//*[@class='G43f7e']//li"));
		int size=autosuggestion.size();
		System.out.println(size);
		Thread.sleep(3000);
		autosuggestion.get(size-1).click();
		
		

	}

}
