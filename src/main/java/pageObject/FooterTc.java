package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterTc {
	
		public  WebDriver driver;
		By footer=By.tagName("div");
		By secondFooter=By.cssSelector("div[class*='footersecond']");

		
		
		//constructor for using driver in home-page
		public FooterTc(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public WebElement footerColumnCount()
		{
			return driver.findElement(footer);
		}

		public WebElement secondFooter()
		{
			return driver.findElement(secondFooter);
		}
		
}
