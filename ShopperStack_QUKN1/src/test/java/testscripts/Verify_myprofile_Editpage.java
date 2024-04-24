package testscripts;


import org.testng.annotations.Test;

import element_Repository.Myprofile_Edit;
import generic_Library.BaseTest;
import generic_Library.SelectClassUtility;




public class Verify_myprofile_Editpage extends BaseTest {
	
	

	@Test
	public void Editpagetestcase()throws InterruptedException
	
	{
		SelectClassUtility dropdown = new SelectClassUtility();
		Myprofile_Edit mye=new Myprofile_Edit(driver);
		base_Page.getAccountButton().click();
		mye.getMyprofilelink().click();
		mye.getEditprofile().click();
		mye.getFirstname().clear();
		mye.getFirstname().sendKeys("Hema");
		mye.getLastName().clear();
		mye.getLastName().sendKeys("Kumari");
		mye.getPhonenumber().sendKeys("9986959317");
		dropdown.selectDropDownByValue(mye.getCountry(), "India");
		dropdown.selectDropDownByVisibleText(mye.getState(), "Karnataka");
		dropdown.selectDropDownByValue(mye.getCity(), "Kolar");
		mye.getSubmitbutton().click();
	
		
	}
}
