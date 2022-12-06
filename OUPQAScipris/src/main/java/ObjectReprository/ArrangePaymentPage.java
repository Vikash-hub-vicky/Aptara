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
		
		@FindBy(xpath="//input[@id='_promocode_']")
		private WebElement promoCode;
		
		@FindBy(xpath="//a[@class='btn btn-primary']")
		private WebElement applyPromo;
		
		@FindBy (xpath="//button[@class='lobibox-btn lobibox-btn-default']")
		private WebElement conformPromo;
		
		@FindBy(xpath="//input[@id='nopub_self']")
		private WebElement iWillPay ;
	
		@FindBy(xpath="//button[text()='Continue']")
		private WebElement continueLink;
		
		
		public WebElement getPromo() {
			return promoLink;
		}
		public WebElement getPromoCode() {
			return promoCode;
		}
        
		public WebElement getApplyPromo() {
			return applyPromo;
		}
		public WebElement getConformPromo() {
			return conformPromo;
		}
        
		public WebElement getiWillPay() {
			return iWillPay;
		}

		public WebElement getContinueLink() {
			return continueLink;
		}
		
		public void enterPromo(String promo) {
		promoCode.sendKeys(promo);
		}
		
		public void clickOnPromo(String promo) {
			promoLink.click();
			promoCode.sendKeys(promo);
			applyPromo.click();
			conformPromo.click();
		}
		
		public void clickOnIwill() {
		    iWillPay.click();
	    }
		
		public BillingPage clickOnContinue() {
			continueLink.click();
			
			return new BillingPage();
		}
}


