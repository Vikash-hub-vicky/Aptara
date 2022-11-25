package AuthorJourney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC_Wlcm_01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();
		driver.findElement(By.xpath("//a[@id='folder14_anchor']")).click();
		driver.findElement(By.xpath("//div[text()='[OUPQA]- Please select a license for article ART-VK/16/11/8']/ancestor::div[@id='script:272']")).click();
		driver.switchTo().frame("MsgBody");
		driver.findElement(By.xpath("//a[contains(text(),'Select a license')]")).click();
		//String ActualTitle = driver.getTitle();
		
//      String exp_title = "WF2 GEA1";
//		String emailTitle = driver.getTitle();
//		Assert.assertEquals(emailTitle, exp_title);
//		
		WebElement referanceText = driver.findElement(By.xpath("//p[text()='WF2 GEA1']"));
	    System.out.println(referanceText.getText());
	    
	   
//		Assert.IsTrue(emailText.Equals("WF2 GEA1"));
		
		
		
		driver.quit();
	
		
		

	}

}
