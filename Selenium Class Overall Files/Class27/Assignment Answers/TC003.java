package pages;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify Invalid Login(Assignment)

public class TC003 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manage");
		
		mySleepInSeconds(3);
		
		String expectedURL = "https://demo.actitime.com/user/submit_tt.do";
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("Valid Login Verified");
		}
		else {
			System.out.println("Invalid Login Credentials");
		}
		
	}
	
}
