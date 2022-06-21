package Utility;

    import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser7;

     public class screenshot {
       public static void main (String[]args) throws Exception {
	WebDriver driver= Browser7.openbrowser(" https://www.facebook.com");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File ("C:\\Users\\Balaji\\OneDrive\\Pictures\\Screenshots\\fb1.jpg");
	
	FileHandler.copy(source, destination);
	driver.manage().window().maximize();
}
       
       
}
