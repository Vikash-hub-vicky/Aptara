package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
WebDriver driver = null;
	
	public WelcomePage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Congratulations on the acceptance of your article']")
	private WebElement welcomeText;
	
	@FindBy(xpath="//button[text()='Continue to license selection']")
	private WebElement continueLink;

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public WebElement getWelcomeLink() {
		return continueLink;
	}
	
	public String welcomeTitle() {
	return driver.getTitle();

	}
	public void clickOnContinueLink() {
		continueLink.click();
		
	}

}
