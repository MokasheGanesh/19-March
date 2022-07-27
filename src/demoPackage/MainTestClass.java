package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTestClass 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(5000);	
		
		Login login= new Login( driver); //
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
	}

}
