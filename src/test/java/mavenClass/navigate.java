package mavenClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://adactinhotelapp.com/Register.php");
       driver.manage().window().maximize();
       driver.navigate().to("https://www.amazon.in/");
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();
       
	}

}
