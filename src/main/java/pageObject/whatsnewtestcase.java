package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class whatsnewtestcase {
	
		public  WebDriver driver;
		
		By whatsnewtab=By.cssSelector("button[class*='btn-default']");
		By textverify=By.cssSelector("h1[class*='header--title'");
		
		//constructor for using driver in home-page
		public whatsnewtestcase(WebDriver driver) {
			
			this.driver=driver;
		}

		public WebElement newtab()
		{
			return driver.findElement(whatsnewtab);
		}
		
		public WebElement text()
		{
			return driver.findElement(textverify);
		}
		
		
}
