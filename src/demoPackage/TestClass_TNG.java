package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_TNG 
{
	 WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(5000);	
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	@Test
	public void validateLoginFunctionality()
	{
		Login login= new Login(driver); //
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
	}
	
	@Test
	public void validateHomePage()
	{
		HomePage home= new HomePage(driver) ;
		home.validateAdminTab();
		home.validatePIMTab();
		home.validateLeaveTab();
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	

}
