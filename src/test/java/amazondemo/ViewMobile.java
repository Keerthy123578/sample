package amazondemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMobile extends baseClass {
	public ViewMobile() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Apple iPhone 14 (128 GB) - Blue")
	WebElement mobile;
	public WebElement getMobile() {
		return mobile;
	}

}
