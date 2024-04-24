package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Removecart extends BasePage{

	public Removecart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//img[@alt='FOREVER 21  Casual Regular Sleeves Solid Women Black Top']")
	private WebElement slectwomenproduct;
	
	@FindBy(xpath=".//button[@id='Add To Cart']")
	private WebElement addtocart;
	
	@FindBy(xpath=".//a[@id='cart']")
	private WebElement carticon;
	
	//(.//button[text()='Remove from cart'])[3]
	@FindBy(xpath="(.//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8'])[3]")
	private WebElement removefromcartbutton;
	
	@FindBy(xpath=".//button[text()='Yes']")
	private WebElement removeyesbutton;
	
	@FindBy(xpath=".//button[text()='Cancel']")
	private WebElement removeCancelbutton;

	public WebElement getSlectwomenproduct() {
		return slectwomenproduct;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCarticon() {
		return carticon;
	}

	public WebElement getRemovefromcartbutton() {
		return removefromcartbutton;
	}

	public WebElement getRemoveyesbutton() {
		return removeyesbutton;
	}

	public WebElement getRemoveCancelbutton() {
		return removeCancelbutton;
	}
	/*public void performRemovecart() throws InterruptedException
	{
		getWomenLink().click();
		getSlectwomenproduct().click();
		Thread.sleep(3000);
		getAddtocart().click();
		getCarticon().click();
		Thread.sleep(3000);
		getRemovefromcartbutton().click();
		getRemoveyesbutton().click();
	}*/
	
}
