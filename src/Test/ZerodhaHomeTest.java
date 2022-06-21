package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZerodhaHomeTest {

	@DataProvider( name ="NameData")
	public Object [][] data(){
			return new Object [][]{{"velocity","katraj"},{"katraj","pune"}};
	}
	
	@Test (dataProvider="NameData")
	public void GoToHomePageTest (String value,String pass ) {
		System.out.println(value + pass);
	}
	 @Test (invocationCount=2)
	  public void testd () {
		 System.out.println("test2home");
	 }
	@Test
	@Parameters({"b"})
	public void teste(int c) {
		System.out.println("test e execute");
		System.out.println(c);
	}
	@Test
	@Parameters({"a","b"})
	public void add (int a,int b) {
		System.out.println(a+b);
	}
	
	
	
}
