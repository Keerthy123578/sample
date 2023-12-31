package adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchHotel extends baseClassAdactin {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement Submit() {
		return Submit;
	}
	@FindBy(id = "location")
	private WebElement Location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement room_type;
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	@FindBy(id = "child_room")
	private WebElement child_room;
	@FindBy(id = "Submit")
	private WebElement Submit;

}
