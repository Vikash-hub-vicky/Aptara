package AuthorJourney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC_CLSbutton_02 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://oup.scipris.com/oupqa/ArticleProcess/ProcessOA?article=MR91%252fIeWxec%253d");
		//driver.findElement(By.id("btnContinue1")).click();
		driver.findElement(By.xpath("//button[text()='Continue to license selection']")).click();
		driver.quit();
		
//		driver.findElement(By.xpath("//select[@id='Author']"));
//		
//		WebElement element = driver.findElement(By.xpath("//select[@id='Author']"));
//		Select select = new Select(element);
//		select.selectByVisibleText("Vikash Singh");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash.kumar@aptaracorp.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='password-field3']")).sendKeys("Aptara@123");
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()=' Sign in']")).click();
//		
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Agree']"));
//		Thread.sleep(2000);
//		ele.click();
//		driver.quit();
		
	
//		WebElement referanceText = driver.findElement(By.xpath("//b[text()=' Select a license']"));
//		WebElement referanceText = driver.findElement(By.xpath("//p[contains(text(),'Please select an option below')]"));
//		System.out.println(referanceText.getText());
		
		
		
	}

}
