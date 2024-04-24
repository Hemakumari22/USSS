package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Library.SelectClassUtility;



public class Myprofile_AddAddress extends BasePage {

	public Myprofile_AddAddress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	SelectClassUtility dropdown = new SelectClassUtility();
	
		@FindBy(xpath="//li[text()='My Profile']")
		private WebElement Myprofilelink;
		
		@FindBy(xpath=".//div[text()='My Addresses']")
		private WebElement myaddresslink;
		
		
		@FindBy(xpath=".//button[text()='Add Address']")
		private WebElement Addaddress;
		
		// need to write code radio button
		@FindBy(xpath=".//input[@id='Home']")
		private WebElement homeradiobutton ;
		
		@FindBy(xpath=".//input[@id='Office']")
		private WebElement Officeradiobutton ;
		
		@FindBy(xpath=".//input[@id='Other']")
		private WebElement Otherradiobutton ;

		@FindBy(xpath=".//input[@id='Name']")
		private WebElement name;
		
		@FindBy(xpath=".//input[@id='House/Office Info']")
		private WebElement Houseinfo;
		
		@FindBy(xpath=".//input[@id='Street Info']")
		private WebElement streetinfo;
		
		@FindBy(xpath=".//input[@id='Landmark']")
		private WebElement Landmark;
				

		@FindBy(xpath="//select[@id='Country']")
		private WebElement country;
		
		@FindBy(xpath="//select[@id='State']")
		private WebElement state;
		
		@FindBy(xpath="//select[@id='City']")
		private WebElement city;
		
		@FindBy(xpath=".//input[@id='Pincode']")
		private WebElement pincode;
		
		@FindBy(xpath=".//input[@id='Phone Number']")
		private WebElement phoneno;
				
		@FindBy(xpath=".//button[@id='btnDisabled']")
		private WebElement addaddressbutton;
		
		//need to check this	
		@FindBy(xpath=".//div[text()='successfully added']")
		private WebElement toastermsg;
		
		
		

		public WebElement getMyprofilelink() {
			return Myprofilelink;
		}

		public WebElement getMyaddresslink() {
			return myaddresslink;
		}

		public WebElement getAddaddress() {
			return Addaddress;
		}

		public WebElement getHomeradiobutton() {
			return homeradiobutton;
		}

		public WebElement getOfficeradiobutton() {
			return Officeradiobutton;
		}

		public WebElement getOtherradiobutton() {
			return Otherradiobutton;
		}

		public WebElement getName() {
			return name;
		}

		public WebElement getHouseinfo() {
			return Houseinfo;
		}

		public WebElement getStreetinfo() {
			return streetinfo;
		}

		public WebElement getLandmark() {
			return Landmark;
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

		public WebElement getPincode() {
			return pincode;
		}

		public WebElement getPhoneno() {
			return phoneno;
		}

		public WebElement getAddaddressbutton() {
			return addaddressbutton;
		}

		public WebElement getToastermsg() {
			return toastermsg;
		}

		
		
public void performAddAddress()

{
	
	getMyprofilelink().click();
	getMyaddresslink().click();
	getAddaddress().click();
	getHomeradiobutton().click();
	getName().sendKeys("");
	getHouseinfo().sendKeys("");
	getStreetinfo().sendKeys("");
	getLandmark().sendKeys("");
	getPincode().sendKeys("");
	getPhoneno().sendKeys("");
	getAddaddressbutton().click();
	dropdown.selectDropDownByValue(country, "India");
	dropdown.selectDropDownByVisibleText(state, "Andhra Pradesh");
	dropdown.selectDropDownByValue(city, "Kadapa");
	
}
		
		
		
		}



