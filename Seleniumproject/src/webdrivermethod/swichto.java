package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class swichto {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
       driver.switchTo().newWindow(WindowType.TAB);
    	driver.get("https://www.amazon.in/");
         Thread.sleep(2000);
         
         driver.close();
	}

}
