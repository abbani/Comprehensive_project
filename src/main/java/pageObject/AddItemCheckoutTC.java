package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItemCheckoutTC {
	
		public  WebDriver driver;
		
		By searchbox= By.cssSelector("input[type='search']");
		By sweaterlable= By.xpath("//span[contains(text(), 'Christmas Sweater Lapel Pin')]");
		By quantity=By.cssSelector("span[class*='js--add']");
		By addtoCart= By.cssSelector("button[class*='add-to-cart']");
	
		By checkoutbt=By.cssSelector("button[class*='cart__checkout']");
		By popup= By.cssSelector("span[class='wa-optin-widget-title-text\']");
		
		//constructor for using driver in home-page
		public AddItemCheckoutTC(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public WebElement searchbox()
		{
			return driver.findElement(searchbox);
		}

		public WebElement item()
		{
			return driver.findElement(sweaterlable);
		}
		
		public WebElement quantity()
		{
			return driver.findElement(quantity);
		}
		
		public WebElement addToCart()
		{
			return driver.findElement(addtoCart);
		}
		
		
		
		public WebElement Checkout()
		{
			return driver.findElement(checkoutbt);
		}
		public WebElement popup()
		{
			return driver.findElement(popup);
		}
		
		
}
//span[contains(text(), 'Christmas Sweater Lapel Pin')]