package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.PopularSuggetionsTC;

public class PopularSuggetion extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test 
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		PopularSuggetionsTC sug= new PopularSuggetionsTC(driver);
		sug.search().click();
		log.info("Clicked on search box");
		log.info("Verifing that popular suggestion list is present or not");
		sug.suggestop().getText();
		Assert.assertEquals(sug.suggestop().getText(),"POPULAR SUGGESTIONS");
		log.info("Popular suggestion list is validated");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}

}
