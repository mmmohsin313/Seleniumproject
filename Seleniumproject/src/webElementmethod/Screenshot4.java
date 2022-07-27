package webElementmethod;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Date date = Date();
		             String date1 = date.toString().replace(" ", "_").replace(":", "_");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
           Thread.sleep(2000);
           
                    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    File dest = new File("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx\\"+date1+".jpg");
    	          FileHandler.copy(source, dest);
		 
	}

	private static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

	}



