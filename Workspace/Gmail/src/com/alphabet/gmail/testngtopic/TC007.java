package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC007 {		//		Execution based on Priority

	@Test(priority=3)
	public void t1() {
		Reporter.log("Running t1 Method", true);
	}
	
	@Test(priority=1)
	public void t2() {
		Reporter.log("Running t2 Method", true);
	}
	
	@Test(priority=2)
	public void t3() {
		Reporter.log("Running t3 Method", true);
	}
	
	//	Default Priority is Zero
	//	If all/few are having same priority then they will be executed in the aphabetical order
	//	Priority can be a -ve number.
	//	Decimal numbers and variables are not allowed

	
}
