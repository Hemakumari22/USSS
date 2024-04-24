package testscripts;

import org.testng.annotations.Test;

import element_Repository.Buynow;

import generic_Library.BaseTest;

public class Verify_kidsproduct_Buynow extends BaseTest{
	
	@Test
	public void Buynowtestcase()throws InterruptedException
	{
		Buynow buynow=new Buynow(driver);
		buynow.getKidsLink().click();
		Thread.sleep(5000);
		buynow.getSelectgirlproduct().click();
		Thread.sleep(5000);
		buynow.getBuynowbutton().click();
		
		
		
	}
	

}
