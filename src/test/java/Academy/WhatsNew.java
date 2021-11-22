package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.whatsnewtestcase;

public class WhatsNew extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		whatsnewtestcase wn= new whatsnewtestcase(driver);
		wn.newtab().click();
		log.info("clicked on WHAT'S NEW TAB");
		log.info("verifing that we have landed on correct page");
		wn.text().getText();
		Assert.assertEquals(wn.text().getText(),"What'S New");
		log.info("verified successfully");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}

}
