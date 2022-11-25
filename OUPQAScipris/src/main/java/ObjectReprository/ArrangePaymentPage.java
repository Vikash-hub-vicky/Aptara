package ObjectReprository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrangePaymentPage {

	WebDriver driver = null;
	
	public ArrangePaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[@id='_AddPromobtn']")
		private WebElement promoLink;
		
		@FindBy(xpath="//input[@id='nopub_self']")
		private WebElement iWillPay ;
	
		@FindBy(xpath="//button[text()='Continue']")
		private WebElement continueLink;

		public WebElement getPromo() {
			return promoLink;
		}

		public WebElement getiWillPay() {
			return iWillPay;
		}

		public WebElement getContinueLink() {
			return continueLink;
		}
		
		
		public void clickOnPromo() {
			promoLink.click();
		}
		
		public void clickOnIwill() {
		iWillPay.click();
	    }
		
		public BillingPage clickOnContinue() {
			continueLink.click();
			
			return new BillingPage();
		}
}


