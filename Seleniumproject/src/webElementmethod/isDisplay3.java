package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay3 {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	WebElement result = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(1000);
		boolean display = result.isDisplayed();
		System.out.println(display);
	}
}
