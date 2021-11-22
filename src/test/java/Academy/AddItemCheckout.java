package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.AddItemCheckoutTC;


public class AddItemCheckout extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test  
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		
		AddItemCheckoutTC ai=new AddItemCheckoutTC(driver);
		ai.searchbox().click();
		log.info("Clicked on search box");
		ai.searchbox().sendKeys("christmas gifts");
		log.info("Searched for CHRISTMAS GIFTS");
		ai.searchbox().sendKeys(Keys.ENTER);
		ai.item().click();
		log.info("Selected item");
		ai.quantity().click();
		log.info("increased quantity if item to 2");
		ai.addToCart().click();
		log.info("Added to cart");
		ai.Checkout().click();
		log.info("Clicked on checkout Option");
		ai.popup().getText();
	    Assert.assertEquals(ai.popup().getText(),"Receive updates on");
	    log.info("TESTCASE EXECUTED SUCCESSFULLY");
	    test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}
	
	

}
