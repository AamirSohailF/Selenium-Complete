package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC015 {		//		enabled/disabled

	@Test
	public void test1()
	{
		Reporter.log("test1",true);
	}
	
	@Test(enabled=false)		//		since test2() method's enabled is set as false, test2() method's execution does not happen
	public void test2()
	{
		Reporter.log("test2",true);
	}
	
}
