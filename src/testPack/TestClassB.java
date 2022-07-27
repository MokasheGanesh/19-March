package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassB {
	
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before Class of ClassB");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method of ClassB");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1 of ClassB");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 of ClassB");

	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method of ClassB");
	}
	


}
