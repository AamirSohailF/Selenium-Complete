package scripts;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic.ExcelLibrary;
import generic.Utilities;
import pages.CategoryPage;
import pages.HomePage;
import pages.OrderDetailPage;
import pages.ProductDetailPage;
public class TC004 extends BaseTest
{
	@DataProvider
	public Object[][] getData()
	{
		return ExcelLibrary.getAllExcelSheetData(XL_PATH, "TC004");
	}
	
	@Test(dataProvider="getData", description="Test With Multiple Sets Of Data")
	public void testMultipleItemAddedToKartUsingExcel(String menuItem,
													  String productID,
													  String quantity,
													  String size,
													  String color)
	{
		HomePage hp = new HomePage(driver, webActionUtil);
				
		productID = Utilities.getIntText(productID);
		int quant=Utilities.returnInteger(quantity);
		
		CategoryPage category = hp.clickOnMenu(menuItem);
		ProductDetailPage pdp = category.OpenProductInQuickView(productID);
		Assert.assertNotEquals(pdp, null);
		pdp.addItemToKart(quant, size, color);
		OrderDetailPage odp = pdp.clickOnProccedToCheckout();
		Assert.assertEquals(odp.isProductDisplayed(productID), true);
	}
}
