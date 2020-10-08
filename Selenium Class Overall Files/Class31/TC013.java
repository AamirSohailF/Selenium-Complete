package testngtopic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TC013
{
	WebDriver driver;
	@BeforeTest
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@Parameters({"username","password"})
	@Test
	public void loginToApp(@Optional("trainee")String u, @Optional("trainee")String p)
	{
		driver.findElement(By.id("username")).sendKeys(u);
		driver.findElement(By.name("pwd")).sendKeys(p);
		driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterTest
	public void closeApp()
	{
		driver.quit();
	}
}
