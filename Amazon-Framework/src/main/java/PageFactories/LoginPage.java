package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	private WebElement signInButton;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginButton()
	{
		signInButton.click();
	}
	
	public void sendEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
}
