package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.GiftcartTestcase;

public class GiftCart extends base{
	
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	@Test 
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		GiftcartTestcase gt=new GiftcartTestcase(driver);
		gt.gifticon().click();
		log.info("clicked on gift icon");
		gt.amountselect().click();
		log.info("Selected the amount 1000rs");
		gt.addcartbt().click();
		log.info("Giftcard added to cart");
		gt.checkoutbt().click();
		log.info("Clicked on checkout");
		gt.text().getText();
		Assert.assertEquals(gt.text().getText(),"Receive updates on");
		log.info("Verified the RECEIVE UPDATES ON popup");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}

}
