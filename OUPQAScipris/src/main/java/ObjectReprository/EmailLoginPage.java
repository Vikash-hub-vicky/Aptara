package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class EmailLoginPage{
	WebDriver driver = null;
	 
	public EmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(id="User")
	private WebElement username;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="Logon")
	private WebElement logIn;
	
	//getter method

	public WebElement getUserName() {
		return username;
	}

	public WebElement getPassWord() {
		return password;
	}

	public WebElement getSignOut() {
		return logIn ;
	}
	
	public EmailAccessPage EmailLoginPage(String un ,String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		logIn.click();
		
		return new EmailAccessPage();
	}
}

	
	



	


