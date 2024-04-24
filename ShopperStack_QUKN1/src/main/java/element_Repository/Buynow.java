package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buynow extends BasePage {

	public Buynow(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	@FindBy(xpath=".//img[@src='https://rukminim1.flixcart.com/image/832/832/l52sivk0/kids-top/w/k/b/7-8-years-2257-peach-niya-original-imagfu43zg2tdkhx.jpeg?q=70']")
	private WebElement selectgirlproduct;
	
	@FindBy(xpath=".//button[@id='Buy Now']")
	private WebElement Buynowbutton;
	
	/*@FindBy(xpath=".//div[@class='selectaddress_addresscont__Ps89s']")
	private WebElement selectaddresspage;*/

	public WebElement getSelectgirlproduct() {
		return selectgirlproduct;
	}

	public WebElement getBuynowbutton() {
		return Buynowbutton;
	}

	/*public WebElement getSelectaddresspage() {
		return selectaddresspage;*/
	
	
/*public void Performbuynow()
{
	getSelectgirlproduct().click();
	getBuynowbutton().click();
}*/


	
	
	

}
