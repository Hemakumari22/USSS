package testscripts;

import org.testng.annotations.Test;

import element_Repository.Removecart;
import generic_Library.BaseTest;

public class Verify_womenproduct_removecart extends BaseTest {
	
	@Test
	public void Removecarttestcase()throws InterruptedException
	{
		
		Removecart removecart=new Removecart(driver);
		removecart.getWomenLink().click();
		Thread.sleep(3000);
		removecart.getSlectwomenproduct().click();
		removecart.getAddtocart().click();
		Thread.sleep(3000);
		removecart.getCarticon().click();
		Thread.sleep(3000);
		removecart.getRemovefromcartbutton().click();
		removecart.getRemoveyesbutton().click();
		
	}


}
