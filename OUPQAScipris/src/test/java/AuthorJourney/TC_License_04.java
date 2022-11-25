package AuthorJourney;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.BaseClass;
import GenericUtility.WebDriverUtility;
import ObjectReprository.LicenseSelectionPage;


public class TC_License_04  {
 	

	

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();
		driver.findElement(By.xpath("//span[text()='VIKASH1']")).click();
		driver.findElement(By.xpath("//div[@id='pagePlaceHolder1']/descendant::div[@class='size']/ancestor::div[@id='script:482']")).click();
		driver.switchTo().frame("MsgBody");
		driver.findElement(By.xpath("//a[contains(text(),'Select a license')]")).click();
		
		Set<String> windowID = driver.getWindowHandles();
//		Iterator<String> it = windowID.iterator();
//		String parentID = it.next();
//		String childID = it.next();
//		System.out.println("Parent Id:"+ parentID);
//		System.out.println("Child Id:"+ childID);
		
        List<String> windowIDsList = new ArrayList(windowID);
		for(String windid: windowIDsList)
		{
			String title= driver.switchTo().window(windid).getTitle();
			System.out.println(title);
		}
		driver.findElement(By.xpath("//button[.='Continue to license selection']")).click();
	//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash.kumar@aptaracorp.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password-field3']")).sendKeys("Aptara@123");
		driver.findElement(By.xpath("//button[text()=' Sign in']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Agree']"));
		Thread.sleep(2000);
		ele.click();
		driver.findElement(By.xpath("//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Read License Terms']")).click();
		driver.findElement(By.xpath("//div[@id='divterms']")).click();
		driver.findElement(By.xpath("//div[@id='divwarranty']")).click();
		driver.findElement(By.xpath("//button[text()='I accept ']")).click();
		driver.quit();
	}

	
		
	}

		
