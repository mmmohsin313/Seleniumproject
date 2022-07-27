package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("mm.mohsin313@gmail.com");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@type = 'text']")).clear();
	    
	}
}
