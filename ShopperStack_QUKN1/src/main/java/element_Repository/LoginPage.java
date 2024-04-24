package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTextField;

	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTextField;

	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	//forget password
	@FindBy(xpath="//input[@id='Forgot Password?']")
			private WebElement forgetpassowrd;
	
		
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public WebElement getForgetpassowrd() {
		return forgetpassowrd;
	}

	
	public void performLogin(String email, String password)
	{
		getEmailTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
	
	
}