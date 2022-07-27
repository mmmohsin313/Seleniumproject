package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup1 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
	      WebDriver driver = new ChromeDriver();

	      driver.get(" https://www.hyrtutorials.com/p/window-handles-practice.html ");
          Thread.sleep(2000);
   
          driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();
         Set<String> ids = driver.getWindowHandles();
         ArrayList<String>ele = new ArrayList<String>(ids);

               String CWID1 = ele.get(1);
               driver.switchTo().window(CWID1);
	}

}
