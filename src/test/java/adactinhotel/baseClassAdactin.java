package adactinhotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClassAdactin {
	public static WebDriver driver;

	public static void launch(String Url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();

	}
	public void sendValue(WebElement ref, String value) {

		ref.sendKeys(value);
	}
	public static void quit() {
		driver.quit();

	}
	public static void GetText(WebElement text) {
		String msg=text.getText();
		System.out.println(msg);
		//return msg;

	}
	public static void dropdown(WebElement ref) {

		Select s = new Select(ref);
		s.selectByIndex(4);
	}
	public static void dropdown1(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByVisibleText(value);
	}
	public static void buttonclick(WebElement ref) {
		ref.click();
	}

}
