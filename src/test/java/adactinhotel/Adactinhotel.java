package adactinhotel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinhotel extends baseClassAdactin {
	@Test
	public void tcl() throws InterruptedException {
		launch("https://adactinhotelapp.com/");
		// driver.navigate().refresh();
		Thread.sleep(4000);
		WebElement user = driver.findElement(By.id("username"));
		sendValue(user, "Keerthy123");
		WebElement pass = driver.findElement(By.id("password"));
		sendValue(pass, "12345K");
		WebElement login = driver.findElement(By.id("login"));
		buttonclick(login);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		WebElement text = driver.findElement(By.xpath("//*[text()='(Fields marked with Red asterix (*) are mandatory)']"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		WebElement Location = driver.findElement(By.id("location"));
		dropdown(Location);
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropdown(hotels);
		WebElement room_type = driver.findElement(By.id("room_type"));
		dropdown(room_type);
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		dropdown(room_nos);
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		dropdown(adult_room);
		WebElement child_room = driver.findElement(By.id("child_room"));
		dropdown(child_room);
		


		WebElement Button = driver.findElement(By.id("Submit"));
		buttonclick(Button);
		Thread.sleep(2000);

		WebElement RadioButton = driver.findElement(By.id("radiobutton_0"));
		buttonclick(RadioButton);

		WebElement Continue = driver.findElement(By.id("continue"));
		buttonclick(Continue);

		WebElement Fname = driver.findElement(By.id("first_name"));
		sendValue(Fname, "keerthy");

		WebElement Lname = driver.findElement(By.id("last_name"));
		sendValue(Lname, "MK");

		WebElement address = driver.findElement(By.id("address"));
		sendValue(address, "Valiyakaatilhouse,mannur,kerala");

		WebElement creditcardNum = driver.findElement(By.id("cc_num"));
		sendValue(creditcardNum, "11234567891234567");

		WebElement cc_type = driver.findElement(By.id("cc_type"));

		dropdown(cc_type);
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		dropdown(cc_exp_month);
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		dropdown(cc_exp_year);
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		sendValue(cc_cvv, "3456");

		//Thread.sleep(2000);
		WebElement booknow = driver.findElement(By.id("book_now"));
		buttonclick(booknow);
		//Thread.sleep(10000);
		 WebElement msg=driver.findElement(By.xpath("//label[text()='Please wait! We are processing your Hotel Booking...']"));
		// Thread.sleep(5000);
		System.out.println(msg.getText());
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
//
//		wait.until(ExpectedConditions.visibilityOfAllElements(msg));
//		String textt=msg.getAttribute("text");
//		System.out.println(textt);
	
		//Thread.sleep(50000);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement order=driver.findElement(By.id("order_no"));
//		wait.until(ExpectedConditions.visibilityOfAllElements(order));
//		//order.click();
//		String orderid=order.getAttribute("value");
//		System.out.println(orderid);
		
	
    Thread.sleep(10000);
	WebElement Ordernum = driver.findElement(By.xpath("//input[@id='order_no']"));
	String order=Ordernum.getAttribute("value");
	System.out.println(Ordernum);
	quit();


	}

}
