package testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC008
{
	@Test(description="dummy test1")
	public void test1()
	{
		Reporter.log("Running test1 method", true);
	}
}
