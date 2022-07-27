package webElementmethod;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {

	
	public static void main(String[] args) throws IOException   {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JK\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				
		/*		Date d = new Date(0);
				String d1 = d.toString().replace(" ", "_").replace(":", "-");
				
				FileHandler.copy(driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).getScreenshotAs(OutputType.FILE),
						new File("C:\\Users\\JK\\OneDrive\\Desktop\\Screenshot\\"+d1+".jpg") );
				*/
	}
}
