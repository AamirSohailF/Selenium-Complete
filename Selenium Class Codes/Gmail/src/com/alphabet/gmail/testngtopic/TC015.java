package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC015
{
	@Test
	public void test1()
	{
		Reporter.log("test1",true);
	}
	
	@Test(enabled=false)
	public void test2()
	{
		Reporter.log("test2",true);
	}
}
