package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyvalue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/r.php");
				Thread.sleep(1000);
				
				WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
				  Select s = new Select(month);
					Thread.sleep(1000);
				  s.selectByValue("6");
					Thread.sleep(1000);
				  s.selectByIndex(2);
					Thread.sleep(1000);
				  s.selectByVisibleText("Dec");
					Thread.sleep(1000);
				  driver.close();
	}
}
