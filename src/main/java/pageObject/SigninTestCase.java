package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninTestCase {
	
		public  WebDriver driver;
		
		By signIn=By.cssSelector("span[class='link_text']");
		By email=By.id("CustomerEmail");
		By password=By.id("CustomerPassword");
		By clickbt=By.xpath("//input[@type='submit']");
		By text=By.xpath("//p[@class='shopify-challenge__message']");
		
		//constructor for using driver in home-page
		public SigninTestCase(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}

		//signin
		public WebElement clicksignin() 
		{
			return driver.findElement(signIn);
		}
		
		//email
		public WebElement emailcred() 
		{
			return driver.findElement(email);
		}
		
		//password
		public WebElement passwordcred() 
		{
			return driver.findElement(password);
		}
		
		//clickbutton
		public WebElement clickonLogin() 
		{
			return driver.findElement(clickbt);
		}
		
		public WebElement textverify() 
		{
			return driver.findElement(text);
		}
		
		
		
		

}
