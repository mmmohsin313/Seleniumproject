package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.instagram.com/accounts/login/");
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("mm.mohsin313@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("MA786313");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
	}
}
