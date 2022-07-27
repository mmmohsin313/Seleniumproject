package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://web.whatsapp.com/");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver1.quit();

	
	}

}
