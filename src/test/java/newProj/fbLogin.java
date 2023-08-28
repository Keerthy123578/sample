package newProj;

import org.testng.annotations.Test;

public class fbLogin extends Baseproj {

	@Test
	public static void TC1() throws InterruptedException {
		Launch("https://www.facebook.com/");
		maximize();
		LoginPage lp = new LoginPage();
		sendValue(lp.getUserName(), "Keerthy");
		sendValue(lp.getPassWord(),"12345");
		Thread.sleep(1000);
		buttonclick(lp.getLognBtn());
		Thread.sleep(5000);
		quit();

	}

}
