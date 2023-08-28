package adactinhotel;

import org.testng.annotations.Test;

public class AdactinHotelPageObjectModel extends baseClassAdactin {
	@Test
	public void Tc1() throws InterruptedException {
		launch("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		AdactinLogin a = new AdactinLogin();
		sendValue(a.getUserName(), "Keerthy123");
		sendValue(a.getPassword(), "12345K");
		buttonclick(a.getLogin());
		//Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(10000);
		SearchHotel s=new SearchHotel();
		
		//dropdown(s.getLocation());
		dropdown1(s.getLocation(),"London");
		dropdown1(s.getHotels(), "Hotel Creek");
		dropdown1(s.getRoom_type(),"Double");
		dropdown1(s.getRoom_nos(),"2 - Two");
		dropdown1(s.getAdult_room(),"3 - Three");
		dropdown1(s.getChild_room(),"2 - Two");
		buttonclick(s.Submit());
		Thread.sleep(2000);
		SelectHotel sh=new SelectHotel();
		buttonclick(sh.radioBtn);
		buttonclick(sh.Continue);
		
		BookHotel bh=new BookHotel();
		sendValue(bh.first_name, "Keerthy");
		sendValue(bh.last_name, "MK");
		sendValue(bh.address, "Kerala");
		sendValue(bh.cc_num, "12345678987654321");
		dropdown1(bh.cc_type, "VISA");
		dropdown1(bh.cc_exp_month, "May");
		dropdown1(bh.cc_exp_year, "2030");
		sendValue(bh.cc_cvv, "2345");
		buttonclick(bh.book_now);
		//Thread.sleep(10000);
//		String msg=bh.msg.getText();
//		System.out.println(msg);
		
		GetText(bh.msg);

	}

}
