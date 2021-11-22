package Resources;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class base {
	
	public static WebDriver driver; //declare here to give access to all methods
	
	public static ExtentTest test;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		 prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\ARIHANT ABBANI\\Comprehensive\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis); //this have knowledge of the property file .
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
public static String getScreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+result+".png";
		
		FileUtils.copyFile(src,new File(path));
		return path;
	}



}
