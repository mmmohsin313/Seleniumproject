package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		//launch browser
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		//open url
		  driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		// swich to iframe
		driver.switchTo().frame("moneyiframe");
		
		//find web element & print value
		 String NSE = driver.findElement(By.id("nseindex")).getText();
          System.out.println(NSE);
		 
	}

}
