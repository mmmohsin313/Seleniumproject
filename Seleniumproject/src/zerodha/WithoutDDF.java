package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
				
		     ChromeOptions option = new ChromeOptions();
		     option.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver();
				driver.get("https://kite.zerodha.com/");
				Thread.sleep(2000);
		
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);

             String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();	
             
             String expectedUID = "OKP335";
             if (expectedUID.endsWith(ActualUID)) {
            	 System.out.println("TC pass");
            	 }
             else {
            	 System.out.println("TC fail");
             }
			
	}

}
