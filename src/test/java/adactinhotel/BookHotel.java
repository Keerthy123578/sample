package adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends baseClassAdactin {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getMsg() {
		return msg;
	}

	@FindBy(id = "last_name")
	WebElement last_name;
	@FindBy(id = "address")
	WebElement address;
	@FindBy(id = "cc_num")
	WebElement cc_num;
	@FindBy(id = "cc_type")
	WebElement cc_type;
	@FindBy(id = "cc_exp_month")
	WebElement cc_exp_month;
	@FindBy(id = "cc_exp_year")
	WebElement cc_exp_year;
	@FindBy(id = "cc_cvv")
	WebElement cc_cvv;
	@FindBy(id = "book_now")
	WebElement book_now;
	@FindBy(xpath = "//label[text()='Please wait! We are processing your Hotel Booking...']")
	WebElement msg;

}
