package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC010 {		//		Testing Report if Exception is Occurred (Throwing Exception Intentionally)

	@Test(description="Testing Report if Exception is Occurred (Throwing Exception Intentionally)")
	public void test() {
		Reporter.log("Running test Method from TC010 class", true);
		throw new IllegalStateException();
	}
	
}
