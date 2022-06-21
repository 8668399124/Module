package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class zerodhaloginpageTest {

	@Test         //testing start hote ya pasun
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test (timeOut =1000)
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test2 execuetd");
        }
	@Test(enabled = false)
	public void test3() {
		System.out.println("test3 execute");
	}
	@BeforeClass 
	public void beforeclass () {
	System.out.println("before class executed");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass executed");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod execute");
	}
	@AfterMethod
	public void aftermethod () {
		System.out.println("aftermethod execute");
	}
	@BeforeTest 
	public void beforetest() {
		System.out.println("before test excute");
	}
	@AfterTest
	public void aftertest () {
		System.out.println("after test execute");
	}
	
	
	
}
