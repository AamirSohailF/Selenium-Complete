package testngtopic;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TC007
{
	@Test(priority=-3)
	public void m1()
	{
		Reporter.log("Running m1 Method", true);
	}
	
	@Test(priority=-5)
	public void m2()
	{
		Reporter.log("Running m2 Method", true);
	}
	
	@Test(priority=-2)
	public void m3()
	{
		Reporter.log("Running m3 Method", true);
	}
}
//Default Priority is Zero
//If all/few are having same priority then they will be executed in the aphabetical order
//Priority can be a -ve number.
//Decimal numbers and variables are not allowed

//m2--->m1---m3
//m3-->m1--->m2

