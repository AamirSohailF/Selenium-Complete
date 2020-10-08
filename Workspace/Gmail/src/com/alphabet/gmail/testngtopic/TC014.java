package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC014 {		//		dependsOnMethods

	@Test
	public void login()
	{
		Reporter.log("Login to App",true);
		throw new IllegalAccessError();			//		since login is failed the rest 2 methods never get executed
	}
	
	@Test(dependsOnMethods= {"login"})
	public void createCustomer()
	{
		Reporter.log("Create a Customer",true);
	}
	
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("Delete a customer",true);
	}
	
}
