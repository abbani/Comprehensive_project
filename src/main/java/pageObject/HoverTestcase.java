package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoverTestcase {
	
		public  WebDriver driver;
		By officialMerchTab= By.cssSelector("a[data-dropdown-rel='official-merchandise']");
		By DCmerch= By.xpath("//div[@id='myheader']/div[1]/div/div/ul/li[8]/ul/li[3]/a");
		By verifyPage= By.cssSelector("h1[class*='section-header--title']");
		
		
		//constructor for using driver in home-page
		public HoverTestcase(WebDriver driver) {
			
			this.driver=driver;
		}

		public WebElement merchHover()
		{
			return driver.findElement(officialMerchTab);
		}
		
		public WebElement DcMerchopt()
		{
			return driver.findElement(DCmerch);
		}
		
		public WebElement text()
		{
			return driver.findElement(verifyPage);
		}
		
}
