package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TC009
{
	@Test(description="dummy test2")
	public void test2()
	{
		Reporter.log("Running test2 method", true);
	}
}
