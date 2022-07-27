package actionclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://guru99.com/test/drag_drop_.html");
		
		 driver.get("https://www.facebook.com/login.php");
		 
		// selenium 3.141 59
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	// selenium 3.141 59
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		// driver.findElement(By.xpath(""))

}
}
