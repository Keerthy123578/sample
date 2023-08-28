package testNg;

import org.testng.annotations.Test;

public class prioritydemo {
	
	//priority
	@Test(priority = 1)
private void tc1() {
	System.out.println("tc1");
}
	//Rerun tc
	@Test(invocationCount = 5)

private void tc2() {
	System.out.println("tc2");

}
	//to skip 
	
	@Test(enabled = false)
private void tc3() {
	System.out.println("tc3");
}
	//timeoutexception
	@Test(timeOut = 1000)
private void tc4() throws InterruptedException {
		Thread.sleep(2000);
	System.out.println("tc4");
}
	@Test(dependsOnMethods = "tc3")
private void tc5() {
	System.out.println("tc3");
}
	
	
	

}
