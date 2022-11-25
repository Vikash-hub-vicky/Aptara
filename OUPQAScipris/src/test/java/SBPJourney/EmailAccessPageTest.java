package SBPJourney;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectReprository.EmailAccessPage;
import ObjectReprository.EmailLoginPage;

public class EmailAccessPageTest extends BaseClass {

	EmailLoginPage EmailLoginPage;
	EmailAccessPage EmailAccessPage;
	

	public EmailAccessPageTest() throws Throwable {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		intilization();
		EmailLoginPage = new EmailLoginPage(driver);
		EmailAccessPage=EmailLoginPage.EmailLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void emailPageTest()
	{
		EmailAccessPage.clickOnVikashFolderLink();
		EmailAccessPage.clickOnArticleMailLink();
		EmailAccessPage.clickOnSelectLicenseLink();
		
	}
	
		
		
	
	
	@AfterMethod
	public void tearDown() {
	 driver.quit();
	}
	
	}
