package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC009 {		//		Testing Parallel Execution of TC008 and TC009 classes

	@Test(description="Testing parallel execution of test cases ----> This is from class TC009")
	public void test2() {
		Reporter.log("Running test2 Method from TC009 class", true);
	}

	
}
