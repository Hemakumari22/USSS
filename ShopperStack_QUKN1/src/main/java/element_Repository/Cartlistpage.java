package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartlistpage extends BasePage{

	public Cartlistpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath=".//a[@id='cart']")
	private WebElement selectcarticon;

	// select any product and i need to write code for increasing the quantity and decreasing the quantity

	public WebElement getSelectcarticon() {
		return selectcarticon;
	}
	
	public void performcartoperation()
	{
		getSelectcarticon().click();
	}
	
	

}
