package resources;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

import Resources.base;




public class listeners extends base implements ITestListener {

	 

		ExtentReports extent= ExtentReporterNG.extentReportGenerator();
		
		String abc=null;
		
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			test= extent.createTest(result.getName());
			
		}

		
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub

		}
		
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			extent.flush();
			
		}
		
		public void onTestFailure(ITestResult result)
		{
			

			try {
				abc=base.getScreenshot("Screenshot captured");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				test.fail(result.getTestName()+" test failed ",MediaEntityBuilder.createScreenCaptureFromPath(abc).build());
				
				
				driver.close();
			
		//	test.addScreenCaptureFromBase64String(getScreenshot(result.getMethod().getMethodName()),result.getMethod().getMethodName());


		}
		
		public void onTestSuccess(ITestResult result)
		{
			

			try {
				abc=base.getScreenshot("Screenshot captured");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				test.pass(result.getTestName()+" test successful",MediaEntityBuilder.createScreenCaptureFromPath(abc).build());
				
				
				driver.close();
		}


	
}
