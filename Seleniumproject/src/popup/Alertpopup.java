package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		      WebDriver driver = new ChromeDriver();
	
		      driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		     driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		      Thread.sleep(2000);
		      
		     driver.switchTo().alert().accept(); 
	}
}
