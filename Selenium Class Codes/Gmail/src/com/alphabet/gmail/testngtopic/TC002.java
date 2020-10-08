package testngtopic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Flaky Test Cases
public class TC002
{
	@Test(invocationCount=3,description="Test Case to test Login with Valid Credentials")
	public void testValidLogin()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
}
//Invocation is used to execute same test case multiple times with same test data
//Default invocation will be 1
//If invocation count is 0 or -ve then the test case wont run
//Decimal numbers are not allowed
//variables are not allowed (But final variables are allowed)
