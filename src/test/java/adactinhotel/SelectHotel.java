package adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends baseClassAdactin {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	WebElement radioBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}
	@FindBy(id = "continue")
	WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	

}
