package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;
//If multiple test cases are written in a single class then all will executed in the alphabetical order
public class TC006
{
	@Test
	public void def()
	{
		Reporter.log("Running def Method", true);
	}
	
	@Test
	public void abc()
	{
		Reporter.log("Running abc Method", true);
	}
	
	@Test
	public void ghi()
	{
		Reporter.log("Running ghi Method", true);
	}
}
