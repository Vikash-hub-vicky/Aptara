package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class LicenseSelectionPage{
	WebDriver driver = null;
 
	public LicenseSelectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")
	private WebElement licenseLink;
	
	@FindBy(xpath="//b[text()='Select a license']")
	private WebElement licenseText;
	
	@FindBy(xpath="//ol[@class='breadcrumb steps chevron']")
	private WebElement chervronDetails;
	
	@FindBy(xpath="//img[@class='mCS_img_loaded']")
	private WebElement logoImg;
	
	@FindBy(xpath="//div[@class='line-text-div' and contains(text(),'I want to opt out of using the available open access agreement')]")
	private WebElement optOutLink;
	
	@FindBy(xpath="//button[text()='Read License Terms']")
	private WebElement termsAndConditionLink;

	//getters method
	public WebElement getLicenseName() {
		return licenseLink;
	}

	public WebElement getLicenseText() {
		return licenseText;
	}

	public WebElement getChervronDetails() {
		return chervronDetails;
	}

	public WebElement getLogoImg() {
		return logoImg;
	}

	public WebElement getOptOut() {
		return optOutLink;
	}

	public WebElement getTermsAndCondition() {
		return termsAndConditionLink;
	}
	//Method
	public boolean validateImage() {
		return logoImg.isDisplayed();

	}
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public void validateLicense() {
		licenseLink.click();
	
	}
	public void optOutt() {
		optOutLink.click();
	}
	public void termAndCondition()
	{
		termsAndConditionLink.click();
	}
		
	
}
