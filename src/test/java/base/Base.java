package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver driver;
	public static void browserLaunch()
	{
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		
		driver.get("https://www.facebook.com/");
	}
	public static void maximizel()
	{
		driver.manage().window().maximize();
	}
	public static void gettitle() {
		// TODO Auto-generated method stub
      String title= driver.getTitle();
       System.out.println(title);
	}
	public static void getcurrenturl() {
		// TODO Auto-generated method stub
      String url=driver.getCurrentUrl();
      System.out.println(url);
	}
	public static void sendvalue(WebElement ref,String value) {
		ref.sendKeys(value);
	}

}
