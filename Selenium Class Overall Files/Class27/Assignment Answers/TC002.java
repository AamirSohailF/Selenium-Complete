package pages;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Search for a task in the home Page (Assignment)

public class TC002 extends BasicSettings{

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = lp.login("admin", "manager");
		hp.searchTask("planning");
		mySleepInSeconds(3);
		//	also clicking on approval and logging out just to check the functionality
		hp.clickOnApproval();
		mySleepInSeconds(3);
		hp.clickOnLogout();
		
		mySleepInSeconds(5);
		driver.close();
		
		
	}
	
}
