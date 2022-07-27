package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	        Select s = new Select(year);
	            boolean result = s.isMultiple();
	            System.out.println(result);
	            if (result==true)   {
	            	System.out.println("list box multiple selectable");
	            }
	            else  {
	            	System.out.println("list box is single selectable");
	            }
	}
}
