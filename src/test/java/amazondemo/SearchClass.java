package amazondemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchClass extends baseClass {
	public SearchClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement searchClick;
	
	public WebElement getSearchClick() {
		return searchClick;
	}

	public WebElement getSearch() {
		return search;
	}

}
