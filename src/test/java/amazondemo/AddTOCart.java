package amazondemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTOCart extends baseClass {
	public AddTOCart() {
		PageFactory.initElements(driver, this);
	}
	@ FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement AddtTOCart;
	public WebElement getAddtTOCart() {
		return AddtTOCart;
	}
	

}
