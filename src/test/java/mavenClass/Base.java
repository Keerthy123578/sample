package mavenClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	static WebDriver driver=new ChromeDriver();

	public static void browserLaunch () {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(10000);
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//driver.quit();

	}
	public static void maximizel()
	{
		driver.manage().window().maximize();
	}

}
