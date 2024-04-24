package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart extends BasePage {

	public Addtocart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//img[@alt='Levis Mens Regular Fit Tee']")
	private WebElement selectmenproduct;
	
	//(.//button[text()='add to cart'])[1]
	
	@FindBy(xpath=".//button[@id='Add To Cart']")
	private WebElement addtocartbutton;
	
	
	
	@FindBy(xpath=".//button[text()='added']")
	private WebElement addedbutton;
	
	public WebElement getSelectmenproduct() 
	{
		return selectmenproduct;
	}
	
	public WebElement getAddtocartbutton() 
	{
		return addtocartbutton;
	}

	public WebElement getAddedbutton() {
		return addedbutton;
	}

	/*public void performaddtocart() throws InterruptedException
	{
	
		getMenLink().click();
		Thread.sleep(3000);
		getSelectmenproduct().click();
		Thread.sleep(3000);
		getAddtocartbutton().click();
		
				
	}*/

	
	
	
	

}
