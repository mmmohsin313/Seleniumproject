package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");

        WebDriver driver = new ChromeDriver();    //upcasting
    	driver.get("https://www.amazon.in/");

    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	driver.manage().window().minimize();
    	Thread.sleep(2000);

		driver.manage().window().minimize();
		Thread.sleep(3000);
	      driver.close();
	}

}
