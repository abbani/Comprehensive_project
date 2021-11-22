package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.SigninTestCase;

public class HomePage extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@Test(dataProvider="getData")
	public void basepage(String username, String password) throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.bigsmall.in/");
		log.info("site openend succesfully");
		
		SigninTestCase st=new SigninTestCase(driver);
		st.clicksignin().click();
		log.info("clicked on signin icon");
		st.emailcred().sendKeys(username);
		st.passwordcred().sendKeys(password);
		log.info("Entered valid login credentials");
		st.clickonLogin().click();
		log.info("Clicked on Login button");
		st.textverify().getText();
		Assert.assertEquals(st.textverify().getText(),"To continue, let us know you're not a robot.");
		log.info("successfully validated");
		
		test.info("TESTCASE EXECUTED SUCCESSFULLY");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[1][2];
		data[0][0]="as3684@srmist.edu.in";
		data[0][1]="password@124";
		
		return data;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("driver closed");
	}

}
