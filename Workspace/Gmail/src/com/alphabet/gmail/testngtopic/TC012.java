package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TC012 {		//		Grouping of TestNG Methods and Also testing alwaysRun
	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("Login",true);
	}
		
	@Test(groups= {"customer", "smoke"})
	public void createCustomer()
	{
		Reporter.log("Test Case to Create Customer",true);
	}
	
	@Test(groups= {"customer"})
	public void deleteCustomer()
	{
		Reporter.log("Test Case to Delete Customer",true);
	}
	
	@Test(groups= {"project", "smoke"})
	public void createProject()
	{
		Reporter.log("Test Case to Create Project",true);
	}
	
	@Test(groups= {"project"})
	public void deleteProject()
	{
		Reporter.log("Test Case to Delete Project",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("Logout",true);
	}
}
