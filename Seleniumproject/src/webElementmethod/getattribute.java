package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(1000);
			
			WebElement result = driver.findElement(By.xpath("//input[@type = 'text']"));
				Thread.sleep(1000);
				
			String attribute = result.getAttribute("type");
            System.out.println(attribute);
  }
}
