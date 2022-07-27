package webElementmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException   {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  String random = RandomString.make(2);
			  
			  File dest = new File("C:\\Users\\JK\\OneDrive\\Desktop\\Screenshot\\Test"+random+".jpg");
			  FileHandler.copy(source, dest);
			  
			  
	}
}
