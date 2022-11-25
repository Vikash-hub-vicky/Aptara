package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class TermsAndConditionPopUp extends WebDriverUtility {
	WebDriver driver = null;
	
	public TermsAndConditionPopUp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='divterms']")
	private WebElement checkBox1;
	
	@FindBy(xpath="//div[@id='divwarranty']")
	private WebElement checkBox2;
	
	@FindBy(xpath="//button[text()='I accept ']")
	private WebElement acceptLink;

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	public WebElement getAcceptLink() {
		return acceptLink;
	}
	
	public ArrangePaymentPage clickOnCheckBox1() {
		checkBox1.click();
		checkBox2.click();
		acceptLink.click();
		
		return new ArrangePaymentPage();
	}
	
	
}
