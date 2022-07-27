package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void test(int a)
	{
		int c= a+20;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{	
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			
			Thread.sleep(5000);
			/*WebElement UserName = driver.findElement(By.id("email"));  // Locator- Id
			UserName.sendKeys("velocity@1234");
			
			UserName.isDisplayed();
			
			WebElement password = driver.findElement(By.name("pass"));
			
			
			password.sendKeys("V1234");   // Locator- Name
			
			driver.findElement(By.tagName("button")).click();		 // Locator- TagName
			
			
			driver.findElement(By.className("button")).click();		 // Locator- ClassName
			
			//input[contains(@name,'Password')]
			*/
			
		//	driver.findElement(By.xpath("//input[@type='text']"))  ;
			
			String a=	driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
			
			System.out.println(a);	
			
			//password.sendKeys("V1234");
			
			TestClass t= new TestClass();
			t.test(10);
			
			
			

	}
}
