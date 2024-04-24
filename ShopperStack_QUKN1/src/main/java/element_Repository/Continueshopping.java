package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Continueshopping extends BasePage {

	public Continueshopping(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath=".//img[@alt='SAMSUNG Galaxy Z Flip4 ']")
	private WebElement selectelectronicproduct;
	
	@FindBy(xpath=".//button[@id='Add To Cart']")
	private WebElement addtocartbutton;
	
	
	@FindBy(xpath=".//a[@id='cart']")
	private WebElement carticon;
	
	
	
	@FindBy(xpath=".//span[text()='Continue Shopping']")
	private WebElement continueshoppingbutton;

	//need to write code for displaying the home page
	

	public WebElement getSelectelectronicproduct() {
		return selectelectronicproduct;
	}



	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}



	public WebElement getCarticon() {
		return carticon;
	}



	public WebElement getContinueshoppingbutton() {
		return continueshoppingbutton;
	}
	
	/*public void performcontinueshopping() throws InterruptedException
	
	{
//		//getLoginButton().click();
//		Thread.sleep(3000);
		getElectronicsLink().click();
		getSelectelectronicproduct().click();
		Thread.sleep(3000);
		getAddtocartbutton().click();
		getCarticon().click();
		Thread.sleep(3000);
		getContinueshoppingbutton().click();
		//getLogoutButton().click();
	}*/

	
	
	
	
	
	
}
