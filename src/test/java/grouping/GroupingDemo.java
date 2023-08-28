package grouping;

import org.testng.annotations.Test;

public class GroupingDemo {
	@Test(groups="sanity")
	public static void tc1() {
		System.out.println("sanity");
	}
	@Test(groups="smoke")
	public static void tc2() {
		
		System.out.println("smoke");
	}
	@Test(groups="regression")
	public static void tc3() {
		System.out.println("regression");

	}
	@Test(groups="UAT")
	public static void tc4() {
		
		System.out.println("UAT");
	}

}
