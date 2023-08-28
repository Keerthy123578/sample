package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String acturl="https://www.facebook.com"
				+ ""
				+ "/";
		//Assert.assertEquals(acturl,"https://www.facebook.co/");
		SoftAssert a=new SoftAssert();
		a.assertEquals(acturl, "https://www.facebook.com/");
		System.out.println("fb page launched");
	    a.assertAll();

	}
	
	

}
