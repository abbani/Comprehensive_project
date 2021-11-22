package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;

import pageObject.HoverTestcase;

public class HoverTab extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  
	public void basepage() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		Thread.sleep(5000L);
		HoverTestcase ht=new HoverTestcase(driver);
		
		Actions actions = new Actions(driver);
		WebElement ele= ht.merchHover();
		actions.moveToElement(ele).perform();
		log.info("Hover to official merchandice");
		Thread.sleep(3000L);
		ht.DcMerchopt().click();
		log.info("Selected the Dc merchandise option");
		ht.text().getText();
		Assert.assertEquals(ht.text().getText(),"Official DC Merchandise");
		log.info("Validated that landed on correct page");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("driver closed");
	}

}
