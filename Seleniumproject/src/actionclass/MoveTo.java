package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) throws InterruptedException {

	       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
			      WebDriver driver = new ChromeDriver();
		
			      driver.get("https://www.flipkart.com/");
			      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			  WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
			  Actions act = new Actions(driver);
			  act.moveToElement(more).perform();
			  
			  driver.findElement(By.xpath("//div[text()='Advertise']")).click();
	}
}
