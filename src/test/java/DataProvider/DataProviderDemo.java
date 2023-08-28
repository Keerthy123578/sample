package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	@Test(dataProvider="login")
	public static void Tc1(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		

	}
	@DataProvider(name="login")
	public Object[][]  LoginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Besant";
		data[0][1]="1234";
		
		data[1][0]="technology";
		data[1][1]="56789";
		return data;
		
		
	}

}
