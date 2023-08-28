package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Base {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		browserLaunch();
		maximizel();
		gettitle();
		getcurrenturl();
		WebElement user=driver.findElement(By.id("email"));
		sendvalue(user, "keerthy");
	}

}
