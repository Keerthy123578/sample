package mavenClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngdemo {
	@BeforeClass
	private void beforeclass() {
	System.out.println("beforeclass");

	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");

	}
    @Test
    private void tec1() {
    	System.out.println("tec1");
	}
    @AfterClass
    private void afterclass() {
    	System.out.println("aftereclass");

	}
    @AfterMethod
    private void aftermethod() {
    	System.out.println("aftermethod");

	}
    
}
