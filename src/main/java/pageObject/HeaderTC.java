package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderTC {
	
		public  WebDriver driver;
		By secondHeader=By.cssSelector("div[class*='header-item--icons']");

		
		
		//constructor for using driver in home-page
		public HeaderTC(WebDriver driver) {
			
			this.driver=driver;
		}
		
		

		public WebElement iconHeader()
		{
			return driver.findElement(secondHeader);
		}
		
}
