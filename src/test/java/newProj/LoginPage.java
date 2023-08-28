package newProj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseproj {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getLognBtn() {
		return LognBtn;
	}

	@FindBy(id = "email")
	private WebElement UserName;
	@FindBy(id = "pass")
	private WebElement PassWord;
	@FindBy(name = "login")
	private WebElement LognBtn;

}
