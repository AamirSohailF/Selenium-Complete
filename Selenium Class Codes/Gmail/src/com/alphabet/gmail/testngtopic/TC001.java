package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TC001//TestNG Class because it contain @Test Annotated Methods
{
	@Test(description="Test Case to test Login with Valid Credentials")
	public void testValidLogin()
	{
		Reporter.log("Running testValidLogin Method", true);
	}
}
