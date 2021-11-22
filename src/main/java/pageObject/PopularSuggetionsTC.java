package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopularSuggetionsTC {
	
		public  WebDriver driver;
		
		By searchbox= By.cssSelector("input[type='search']");
		By suggest= By.cssSelector("li[class*='snize-label']");
		
	
		
		//constructor for using driver in home-page
		public PopularSuggetionsTC(WebDriver driver) {
			
			this.driver=driver;
		}

		public WebElement search()
		{
			return driver.findElement(searchbox);
		}
		
		public WebElement suggestop()
		{
			return driver.findElement(suggest);
		}
		
}
