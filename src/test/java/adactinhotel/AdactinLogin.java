package adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends baseClassAdactin {
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "username")
	private WebElement UserName;
	
	

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(id = "login")
	private WebElement Login;

}
