package SBPJourney;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectReprository.AuthorLoginPage;
import ObjectReprository.EmailAccessPage;
import ObjectReprository.EmailLoginPage;

public class EmailLoginTest extends BaseClass {
	EmailLoginPage EmailLoginPage;
	EmailAccessPage EmailAccessPage;
	

	public EmailLoginTest() throws Throwable {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		intilization();
		EmailLoginPage = new EmailLoginPage(driver);
		
		
	}
	
	@Test
	public void emailLoginTest(){
	
		
		EmailLoginPage.EmailLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
		
		
	
	
	@AfterMethod
	public void tearDown() {
	 //driver.quit();
	}
	
	}

