package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateGiftTc {
	
		public  WebDriver driver;
		
	By giftoption= By.cssSelector("a[data-dropdown-rel='corporate-gifts']");
	By namefield= By.id("contactFormName");
	By emailfield= By.id("contactFormEmail");
	By numberfield= By.id("contactFormPhone");
	By enquiryfield= By.id("contactFormMessage");
	By submit=By.xpath("//*[@id='contactFormWrapper']/div/input[4]");
	By text=By.xpath("//p[@class='shopify-challenge__message']");
		//constructor for using driver in home-page
		public CorporateGiftTc(WebDriver driver) {
			
			this.driver=driver;
		}

		
		public WebElement giftoption()
		{
			return driver.findElement(giftoption);
		}
		
		public WebElement namecolum()
		{
			return driver.findElement(namefield);
		}
		
		public WebElement emailcolum()
		{
			return driver.findElement(emailfield);
		}
		
		public WebElement numbercolum()
		{
			return driver.findElement(numberfield);
		}
		
		public WebElement enquirycolum()
		{
			return driver.findElement(enquiryfield);
		}
		
		public WebElement submitbutton()
		{
			return driver.findElement(submit);
		}
		
		public WebElement text() 
		{
			return driver.findElement(text);
		}
		
		
		
}
