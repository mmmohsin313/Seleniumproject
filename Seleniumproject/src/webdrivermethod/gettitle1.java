package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle1 {

	public static void main(String[] args) {

		 String exptitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	   		
         WebDriver driver = new ChromeDriver();
     	driver.get("https://www.amazon.in/");
     	
          String title = driver.getTitle();
          System.out.println(title);


    if (title.equalsIgnoreCase(exptitle))  {
     	System.out.println("navigate to rigth page");
	
}
   else {
      	System.out.println("navigate to wrong path");
}

	}

}
