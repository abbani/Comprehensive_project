package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.HeaderTC;

public class Header extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  
	public void basepage() throws IOException
	{
		
		
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		HeaderTC ht=new HeaderTC(driver);
		
	WebElement footdriver=ht.iconHeader();
		int n=footdriver.findElements(By.tagName("a")).size();
		log.info("Nav link count:4 (expected)");
		System.out.println(n);
		
		if(n==4)
			{
			log.info("The Total count MATCHED");
			}
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("Driver closed");
	}

}
