package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	/**
	*
	*@author Afshan
	*
	**/
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//button[@id='loginBtn']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath = "//a[@id='women']")
	private WebElement womenLink;
	
	@FindBy(xpath = "//a[@id='kids']")
	private WebElement kidsLink;
	
	@FindBy(xpath = "//a[@id='electronics']")
	private WebElement electronicsLink;
	
	
	@FindBy(xpath = ".//a[@id='beautyProducts']")
	private WebElement beautyProductsLink;
	
	
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountButton;
	
	@FindBy(xpath="(.//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")
	private WebElement logoutButton;
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}
	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getBeautyProductsLink() {
		return beautyProductsLink;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void performLogout() {
		getLoginButton().click();
//		getMenLink().click();
//		getWomenLink().click();
//		getKidsLink().click();
//		getBeautyProductsLink().click();
	//	getAccountButton().click();
		getLogoutButton().click();
				

	}
	
	
}
