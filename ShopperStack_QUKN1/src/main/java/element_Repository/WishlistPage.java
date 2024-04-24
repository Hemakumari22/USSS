package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage {

	public WishlistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=".//img[@alt='Lakme Forever Matte Lipstick']")
	private WebElement slectwomenproduct;
	
	//need to identify element for wish icon
	@FindBy(xpath=".//svg[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement selectwishicon;
	
	
	@FindBy(xpath=".//li[text()='Wish List']")
	private WebElement checkwishlistpage;
	
	@FindBy(xpath=".//button[text()='Add To Cart']")
	private WebElement checkcartpage;
	
	@FindBy(xpath="//.//a[@id='cart']]")
	private WebElement checkcarticon;

	public WebElement getSlectwomenproduct() {
		return slectwomenproduct;
	}

	public WebElement getSelectwishicon() {
		return selectwishicon;
	}

	public WebElement getCheckwishlistpage() {
		return checkwishlistpage;
	}

	public WebElement getCheckaddtocartpage() {
		return checkcartpage;
	}

	public WebElement getCheckcarticon() {
		return checkcarticon;
	}
	
	public void performwishlist()
	{
		getSelectwishicon().click();
		getWomenLink().click();
		getSlectwomenproduct().click();
		getCheckwishlistpage().click();
		getCheckaddtocartpage().click();
		getCheckcarticon().click();
		
	}
	
	
	
	
	
}
