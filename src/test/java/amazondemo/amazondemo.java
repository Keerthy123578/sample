package amazondemo;

import java.io.IOException;

import org.testng.annotations.Test;

public class amazondemo extends baseClass {
	@Test

private void addToCart() throws IOException, InterruptedException {
		
		
		
		launch("https://www.amazon.in/");
		maximize();
		
		SearchClass s=new SearchClass();
		SendValue(s.getSearch(), "iphone 14");
		click(s.searchClick);
		ViewMobile v=new ViewMobile();
		Scrollinto(v.mobile);
		click(v.mobile);
		Thread.sleep(4000);
		AddTOCart a=new AddTOCart();
		click(a.AddtTOCart);
		//Scrollinto(a.AddtTOCart);
		Thread.sleep(4000);
	    CaptureScreenshot();
		quit();
		
		

}

}
