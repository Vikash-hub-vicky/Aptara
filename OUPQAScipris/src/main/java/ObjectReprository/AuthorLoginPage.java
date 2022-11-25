package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class AuthorLoginPage {
	WebDriver driver = null ;
	public AuthorLoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ol[@class='breadcrumb steps chevron']")
	private WebElement chervonText;
	
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password-field3']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Sign in']")
	private WebElement saveButtonLink;

	
    public WebElement getChervonText() {
	  return chervonText;
}

    public WebElement getUsername() {
	   return username;
}

    public WebElement getPassword() {
	   return password;
}

   public WebElement getSaveButtonLink() {
	   return saveButtonLink;
}
    public String chevronTitle() {
	 return driver.getTitle();
}
    public void AuthorLogin(String UN, String PW)
    {
    	username.sendKeys(UN);
    	password.sendKeys(PW);
    	saveButtonLink.click();
    	
    	
    }

}