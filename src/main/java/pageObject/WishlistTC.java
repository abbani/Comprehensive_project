package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistTC {
	
		public  WebDriver driver;
		By personGift= By.xpath("//button[contains(text(), 'Personalized Gifts')]");
		By keychain = By.xpath("//div[contains(text(), 'Personalized Metallic Keychain I COD Not Available')]");
		By wishoption= By.cssSelector("span[class='swym-wishlist-cta']");
		By wishIcon= By.xpath("//span[contains(text(), 'wish list')]");
		By popup= By.id("swym-welcome-button");
		By wishProduct= By.xpath("//a[contains(text(), 'Personalized Metallic Keychain I COD ...')]");

		
		
		//constructor for using driver in home-page
		public WishlistTC(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public WebElement personGiftOP()
		{
			return driver.findElement(personGift);
		}

		public WebElement product()
		{
			return driver.findElement(keychain);
		}
		
		public WebElement wishoption()
		{
			return driver.findElement(wishoption);
		}
		
		public WebElement wishlistICON()
		{
			return driver.findElement(wishIcon);
		}
		
		public WebElement popupwish()
		{
			return driver.findElement(popup);
		}
		
		public WebElement WishProduct()
		{
			return driver.findElement(wishProduct);
		}
}
