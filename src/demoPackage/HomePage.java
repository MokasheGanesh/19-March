package demoPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//*[text()='Admin']")
	private WebElement AdminTab;
	
	@FindBy (xpath="//*[text()='PIM']")
	private WebElement PIMTab;
	
	
	@FindBy (xpath="//*[text()='Leave']")
	private WebElement LeaveTab;
	
	public HomePage(WebDriver driver )
	{
		this.driver= driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void validateAdminTab()
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
		
		AdminTab.isDisplayed();
	}
	
	public void validatePIMTab()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
		PIMTab.isDisplayed();
	}
	
	public void validateLeaveTab()
	{
		LeaveTab.isDisplayed();
	}
	
	
	
}
