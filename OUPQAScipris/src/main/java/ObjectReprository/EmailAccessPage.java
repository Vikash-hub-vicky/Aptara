package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class EmailAccessPage extends WebDriverUtility {
	WebDriver driver = null;
	
	public EmailAccessPage() {
	PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//span[text()='VIKASH1']")
	private WebElement VikashFolderLink;
	
	@FindBy(xpath="//div[@id='pagePlaceHolder1']/descendant::div[@id='script:447']")
	private WebElement articleMailLink;
	
	@FindBy(id="MsgBody")
	private WebElement ea1;
	
	@FindBy(xpath="//a[contains(text(),'Select a license')]")
	private WebElement selectaLicenseLink;

	public WebElement getVikashFolder() {
		return VikashFolderLink;
	}

	public WebElement getArticleMail() {
		return articleMailLink;
	}

	public WebElement getEa1() {
		return ea1;
	}

	public WebElement getSelectaLicense() {
		return selectaLicenseLink;
	}
	
	public void clickOnVikashFolderLink() {
		VikashFolderLink.click();
		}
	
	public void clickOnArticleMailLink() {
		articleMailLink.click();
	}
	public WelcomePage clickOnSelectLicenseLink() {
		switchframes(driver , ea1 );
		selectaLicenseLink.click();
		return new WelcomePage();
	}
}
