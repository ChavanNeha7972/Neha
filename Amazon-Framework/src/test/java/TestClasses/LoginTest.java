package TestClasses;

import org.testng.annotations.Test;

import BrowserSetup.TestBaseClass;
import PageFactories.LoginPage;

public class LoginTest extends TestBaseClass
{
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnLoginButton();
		Thread.sleep(0);
		loginpage.sendEmail(user);
		loginpage.clickOnContinueButton();
		Thread.sleep(0);
		loginpage.sendPassword(pass);
		loginpage.clickOnSubmit();
		
	}
}
