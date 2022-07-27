package zerodha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

    FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\ZerodhaCredential.xlsx");
              Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
    
      		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe\\");
      		
      		WebDriver driver = new ChromeDriver();
				driver.get("https://kite.zerodha.com/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
	
				//step 1 entering UN with DDF
		       String UN = sh.getRow(0).getCell(0).getStringCellValue();
               driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
				Thread.sleep(2000);

           	//step 2 entering PWD with DDF
		       String PWD = sh.getRow(1).getCell(0).getStringCellValue();
              driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
				Thread.sleep(2000);

               driver.findElement(By.xpath("//button[@type='submit']")).click();
             Thread.sleep(2000);
            	//step 3 entering Pin with DDF
		       String Pin = sh.getRow(2).getCell(0).getStringCellValue();
              driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(Pin);
				Thread.sleep(2000);

              driver.findElement(By.xpath("//button[@type='submit']")).click();
            
	}

}
