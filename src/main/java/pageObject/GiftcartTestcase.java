package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftcartTestcase {
	
		public  WebDriver driver;
		
		By gift=By.cssSelector("i[class*='fa-gift']");
		By value=By.cssSelector("label[for*='title-Rs.+1000']");
		By addToCart= By.cssSelector("button[name='add']");
		By checkoutbt= By.cssSelector("button[name='checkout']");
		By verifytext=By.cssSelector("span[class*='widget-title-text']");
		
	
		
		//constructor for using driver in home-page
		public GiftcartTestcase(WebDriver driver) {
			
			this.driver=driver;
		}

		
		public WebElement gifticon()
		{
			return driver.findElement(gift);
		}
		
		public WebElement amountselect()
		{
			return driver.findElement(value);
		}
		
		public WebElement addcartbt()
		{
			return driver.findElement(addToCart);
		}
		public WebElement checkoutbt()
		{
			return driver.findElement(checkoutbt);
		}
		
		public WebElement text()
		{
			return driver.findElement(verifytext);
		}
		
}
