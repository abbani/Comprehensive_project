package Resources;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Resources.base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

public class listeners extends base implements ITestListener {

	 

		ExtentReports extent= ExtentReporterNG.extentReportGenerator();
		
		String abc=null;
		
		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			test= extent.createTest(result.getName());
			
		}

		
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub

		}
		
		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			extent.flush();
			
		}
		
		@Override
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
		
		@Override
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
