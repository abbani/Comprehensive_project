package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.CorporateGiftTc;

public class CorporateGift extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test  (dataProvider="getData")
	public void basepage(String name, String email, String number, String enquire) throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		//creating object of corporate-gift-tc here
		CorporateGiftTc cg=new CorporateGiftTc(driver);
		cg.giftoption().click();
		log.info("clicked on corporate gift tab");
		cg.namecolum().sendKeys(name);
		cg.emailcolum().sendKeys(email);
		cg.numbercolum().sendKeys(number);
		cg.enquirycolum().sendKeys(enquire);
		log.info("Enter the details for communication");
		cg.submitbutton().click();
		log.info("clicked on submit button");
		cg.text().getText();
		log.info("landed on destination page successfuly");
		Assert.assertEquals(cg.text().getText(),"To continue, let us know you're not a robot.");

		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[1][4];
		data[0][0]="Arihant abbani";
		data[0][1]="abcd@gmail.com";
		data[0][2]="1122334455";
		data[0][3]="Noting to enquire .. jst testing it";
		
		return data;
		
	} 
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
