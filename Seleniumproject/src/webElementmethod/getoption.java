package webElementmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoption {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	        Select s = new Select(year);
	            List<WebElement> options = s.getOptions();
	            int size = options.size();
	            System.out.println("size of year list box ="+size);
	}

}
