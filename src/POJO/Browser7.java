package POJO;

     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class Browser7 {
    	 
	 public static WebDriver openbrowser (String url) {
	
	 System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver ();//upcasting chrome driver to webdriver
	 
	 driver.get(url);
	 
	 return driver;
	
	
	
	}
}
