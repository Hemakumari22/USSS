package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Library.SelectClassUtility;

public class Myprofile_Edit extends BasePage {

	
	public Myprofile_Edit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	

	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement Myprofilelink;
			
	
	@FindBy(xpath="//button[@text='Edit Profile']")
	private WebElement Editprofile;
	
	@FindBy(xpath=".//input[@id='First Name']")
	private WebElement Firstname;
	
	@FindBy(xpath=".//input[@id='Last Name']")
	private WebElement LastName;
	
	//@FindBy(id="") need to choose for DOB
	
	@FindBy(xpath=".//input[@id='Phone Number']")
	private WebElement phonenumber;
	
	@FindBy(xpath="//select[@id='Country']")
	private WebElement country;
	
	@FindBy(xpath="//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='City']")
		private WebElement city;
	
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitbutton;
	
	
	
	public WebElement getMyprofilelink() {
		return Myprofilelink;
	}

	public WebElement getEditprofile() {
		return Editprofile;
	}
	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	
	/*public void editProfile()
	{
		getEditprofile().click();
		getFirstname().sendKeys("");
		getLastName().sendKeys("");
		dropdown.selectDropDownByValue(country, "India");
		dropdown.selectDropDownByVisibleText(state, "Andhra Pradesh");
		dropdown.selectDropDownByValue(city, "Kadapa");
		getSubmitbutton().click();*/
		
	}
	
	


