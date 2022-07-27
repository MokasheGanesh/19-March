package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
		
	@FindBy (xpath="//input[@name='txtUsername']")
	private WebElement UserName;
	
	@FindBy (xpath="//input[@name='txtPassword']")
	private WebElement Password;
	
	
	@FindBy (xpath="//input[@name='Submit']")
	private WebElement LoginButton;
	
	public Login(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendUserName()
	{
		UserName.sendKeys("Admin");
	}
	
	public void sendPassword()
	{
		Password.sendKeys("admin123");
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
}
