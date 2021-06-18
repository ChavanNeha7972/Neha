package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utilities.ReadConfig;

public class TestBaseClass extends ReadConfig
{
	ReadConfig readconfig=new ReadConfig();

	public String url=readconfig.getURL();
	public String user=readconfig.getUsername();
	public String pass=readconfig.getPassword();
	public String chromepath=readconfig.getChromePath();
	public String firefoxpath=readconfig.getFirefoxPath();
	
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void Setup(String browserinstance)
	{		
		if(browserinstance.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",chromepath);
			driver=new ChromeDriver();
		}
		else if(browserinstance.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",firefoxpath);
			driver=new FirefoxDriver();
		}
		driver.get(url);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
