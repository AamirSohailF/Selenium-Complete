package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TC010
{
	@Test(description="dummy test3")
	public void test3()
	{
		Reporter.log("Running test3 method", true);
		throw new IllegalStateException("Introducting dummy exception");
	}
}
