package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.WishlistTC;

public class Wishlist extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		WishlistTC wt= new WishlistTC(driver);
		
		wt.personGiftOP().click();
		log.info("Clicked on personalised gift option");
		wt.product().click();
		log.info("clicked on a product");
		wt.wishoption().click();
		log.info("clicked on ADD TO WISHLIST option");
		wt.wishlistICON().click();
		log.info("Option wishlist page");
		log.info("Verifing that the product is added to wishlist or not");
		wt.popupwish().click();
		System.out.println(wt.WishProduct().isDisplayed());
		log.info("Product added to wishlist successfully");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}
}
