package testPack;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



public class TestClassA {
	
	@Parameter
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite of ClassA");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test of ClassA");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before Class of ClassA");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method of ClassA");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1 of ClassA");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 of ClassA");

	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method of ClassA");
	}
	
	@AfterClass
	public void afterClass()
	{
			
		System.out.println("After Class of ClassA");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test of ClassA");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite of ClassA");
	}

}
