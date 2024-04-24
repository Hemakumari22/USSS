package testscripts;

import org.testng.annotations.Test;

import element_Repository.Addtocart;
import generic_Library.BaseTest;

public class Verify_Menproduct_Addtocart extends BaseTest{
	
	@Test
	public void Addtocarttestcase()throws InterruptedException
	{
		Addtocart addcart=new Addtocart(driver);
		Thread.sleep(3000);
		addcart.getMenLink().click();;
		addcart.getSelectmenproduct().click();
		Thread.sleep(3000);
		addcart.getAddtocartbutton().click();
		Thread.sleep(3000);
		addcart.getAddedbutton().click();
		
		
		
	}
	

}
