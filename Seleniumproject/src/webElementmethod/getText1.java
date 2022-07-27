package webElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/r.php");
				
            WebElement Text = driver.findElement(By.xpath("//select[@aria-label='Year']"));
             String Result = Text.getText();
             System.out.println(Result);
	}
}
