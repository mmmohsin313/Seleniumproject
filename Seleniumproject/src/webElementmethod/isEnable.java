package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	
		       WebElement result = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		       
		         boolean data = result.isEnabled();
		         System.out.println(data);
	}

}
