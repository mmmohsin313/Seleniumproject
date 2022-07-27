package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	   WebElement Female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	   Female.click();
	   Thread.sleep(2000);
	       boolean result = Female.isSelected();
	       System.out.println(result);
	  if (result==true) {
		  System.out.println("element is selected");
	  }
	  else {
		  System.out.println("element is not selected");
	  }

	}

}
