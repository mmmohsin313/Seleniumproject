package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {

	public static void main(String[] args) throws InterruptedException {


		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		      WebDriver driver = new ChromeDriver();
	
		      driver.get("https://skpatro.github.io/demo/links/");
	           Thread.sleep(2000);
 
	           driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();   //click on new tab button
	              Set<String> ids = driver.getWindowHandles();
	              ArrayList<String>al = new ArrayList<String>(ids);

                   String CWID = al.get(1);    //child browser address	           
	           driver.switchTo().window(CWID);      
	           Thread.sleep(2000);
	           driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	           driver.switchTo().window(al.get(0));
	           driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	        //   https://www.hyrtutorials.com/p/window-handles-practice.html 
	}

}
