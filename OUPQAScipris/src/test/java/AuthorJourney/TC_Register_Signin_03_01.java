package AuthorJourney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Register_Signin_03_01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.get("https://webmailmd.aptaracorp.com/");
//		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
//		driver.findElement(By.xpath("//button[@id='Logon']")).click();
//		driver.findElement(By.xpath("//a[@id='folder9_anchor']")).click();
//		driver.findElement(By.xpath("//div[text()='4:38 pm']/ancestor::div[@id='script:40553']")).click();
//		driver.switchTo().frame("MsgBody");
//		driver.findElement(By.xpath("//a[contains(text(),'Select a license')]")).click();
//		//driver.findElement(By.xpath("//div[@id='welcome']/descendant::form[@action='/oupqa/ArticleProcess/LoginOrRegistration']/descendant::button[@id='btnContinue1']")).click();
		
		driver.get("https://oup.scipris.com/oupqa/ArticleProcess/ProcessOA?article=X%252frMawD8pU4%253d");
		driver.findElement(By.xpath("//button[text()='Continue to license selection']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash.kumar/1@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Aptara@123");
		driver.findElement(By.xpath("//input[@id='password-field2']")).sendKeys("Aptara@123");
		driver.findElement(By.xpath("//button[@id='Register']")).click();
		driver.quit();

	}

}
