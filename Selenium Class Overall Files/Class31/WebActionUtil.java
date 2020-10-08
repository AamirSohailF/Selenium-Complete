package generic;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebActionUtil
{
	WebDriver driver;
	JavascriptExecutor js;
	Actions actions;
	public WebActionUtil(WebDriver driver) 
	{
		this.driver=driver;
		js = (JavascriptExecutor)driver;
		actions = new Actions(driver);
	}
	
	public void enterKeys(String keyToEnter, WebElement target)
	{
		target.clear();
		target.sendKeys(keyToEnter);
	}
	
	public void click(WebElement target)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	
	public void jsClick(WebElement target)
	{
		js.executeScript("arguments[0].click();", target);
	}
	
	public void jsEnterKeys(String keysToEnter, WebElement target)
	{
		js.executeScript("arguments[0].value="+keysToEnter+";", target);
	}
	
	public void scrollDown(int pixels)
	{
		js.executeScript("window.scrollBy(0,"+pixels+");");
	}
	
	public void scrollUp(int pixels)
	{
		js.executeScript("window.scrollBy(0,-"+pixels+");");
	}
	
	public void selectByVisibleText(WebElement listBox, String text)
	{
		Select s = new Select(listBox);
		s.selectByVisibleText(text);
	}
	
	public void moveToElement(WebElement target)
	{
		actions.moveToElement(target).perform();
	}
	
	public void dragAndDrop(WebElement source ,WebElement target)
	{
		actions.dragAndDrop(source, target).perform();
	}
	
	public void rightClick(WebElement target)
	{
		actions.contextClick(target).perform();
	}
	
	public void switchToFrame(String idNameOrIndex)
	{
		Utilities.sleepInSeconds(5);
		try
		{
			int index = Integer.parseInt(idNameOrIndex);
			driver.switchTo().frame(index);
		}
		catch(NumberFormatException e) 
		{
			driver.switchTo().frame(idNameOrIndex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}







