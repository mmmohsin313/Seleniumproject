package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByattributeT {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//body[contains(@style,'bac')]")).click();
		driver.findElement(By.xpath("(//input[@aria-required='true'])[1]")).sendKeys("mm.mohsin313@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("MA786313");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'             ')])[1]")).click();		
	}

}
