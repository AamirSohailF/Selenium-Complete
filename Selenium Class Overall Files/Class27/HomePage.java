package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	//Creating WebElements
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(className="switcherBackground")
	private WebElement approvalSwitcher;
	
	@FindBy(id="taskSearchControl_field")
	private WebElement taskSearchField;
	
	//Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Action Methods
	public void clickOnLogout()
	{
		logoutLink.click();
	}
	
	public void clickOnApproval()
	{
		approvalSwitcher.click();
	}
	
	public void searchTask(String keywordToSearch)
	{
		taskSearchField.sendKeys(keywordToSearch);
	}
}
