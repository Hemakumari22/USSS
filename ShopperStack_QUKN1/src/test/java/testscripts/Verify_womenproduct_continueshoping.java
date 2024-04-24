package testscripts;

import org.testng.annotations.Test;


import element_Repository.Continueshopping;
import generic_Library.BaseTest;

public class Verify_womenproduct_continueshoping extends BaseTest {
	
	
		@Test
		public void Continueshoppingtestcase()throws InterruptedException
		{
			Continueshopping continueshopping=new Continueshopping(driver);
			continueshopping.getElectronicsLink().click();
			Thread.sleep(3000);
			continueshopping.getSelectelectronicproduct().click();
			Thread.sleep(3000);
			continueshopping.getAddtocartbutton().click();
			Thread.sleep(3000);
			continueshopping.getCarticon().click();
			Thread.sleep(3000);
			continueshopping.getContinueshoppingbutton().click();
			
			
			
		}

}
