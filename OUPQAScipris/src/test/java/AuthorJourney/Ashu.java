package AuthorJourney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ashu {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("ashutosh.gaur@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ASHUshaun198");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();

	}

}
