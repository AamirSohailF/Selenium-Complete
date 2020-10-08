package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TC011 {		//		Chronological Order of Execution

	@BeforeSuite
	public void m1()
	{
		Reporter.log("@BeforeSuite",true);
	}
	
	@BeforeTest
	public void m2()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@BeforeClass
	public void m3()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@BeforeMethod
	public void m4()
	{
		Reporter.log("@BeforeMethod",true);
	}
	
	@Test
	public void m5()
	{
		Reporter.log("@Test",true);
	}
	
	@Test
	public void t1()
	{
		Reporter.log("@Test",true);
	}
	
	@AfterMethod
	public void m6()
	{
		Reporter.log("@AfterMethod",true);
	}
	
	@AfterClass
	public void m7()
	{
		Reporter.log("@AfterClass",true);
	}
	
	@AfterTest
	public void m8()
	{
		Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite
	public void m9()
	{
		Reporter.log("@AfterSuite",true);
	}
	
}
