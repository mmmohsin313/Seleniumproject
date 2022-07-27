package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();   // upcasting
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	        WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	        Select s = new Select(month);
	         boolean result = s.isMultiple();
	          System.out.println(result);
	          
	          if (result==true)  {
	        	  System.out.println("list box is multiple selectable");
	          }
	          else  {
	        	  System.out.println("list box is single selectable");
	          }
	}
}
