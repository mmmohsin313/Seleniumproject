package webdrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpositionanddimention {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		Dimension D2 = new Dimension(300,400);
	     driver.manage().window().setSize(D2);
	     
	     Point p = new Point(500,600);
	     driver.manage().window().setPosition(p);   

	}

}
