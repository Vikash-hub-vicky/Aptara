package AuthorJourney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Register_Signin_03_02 {

	public static void main(String[] args)throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://oup.scipris.com/oupqa/ArticleProcess/LoginOrRegistration");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='password-field3']")).sendKeys("Aptara@123");
	    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Agree']"));
        ele.click();
		//driver.quit();

	}

}
