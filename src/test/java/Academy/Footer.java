package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.FooterTc;

public class Footer extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  
	public void basepage() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");

		FooterTc ft=new FooterTc(driver);
		log.info("Total Div available in home page");
		System.out.println(ft.footerColumnCount().getSize());
		WebElement footdriver=ft.secondFooter();
		log.info("Total Div column available in footer");
		int n=footdriver.findElements(By.tagName("div")).size();
		System.out.println(n);
		
		if(n==6)
		{
			log.info("Condition passed");
		}
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
