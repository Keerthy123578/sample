package newProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseproj {
	public static WebDriver driver;

	public static void Launch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void sendValue(WebElement ref, String value) {

		ref.sendKeys(value);
	}


	public static void dropdown(WebElement ref) {
		Select s = new Select(ref);

		s.selectByIndex(4);
//	for(int i=0;i<=5;i++)
//	{
//		if(i==0)
//		{
//			//dropdown(ref);
//		    s.selectByIndex(2);
//		   break;
//		}
//		if(i==1)
//		{
//			//dropdown(ref);
//			s.selectByIndex(0);
//		}
//	}

	}

	public static void buttonclick(WebElement ref) {
		ref.click();
	}

	public static void quit() {
		driver.quit();

	}

}
