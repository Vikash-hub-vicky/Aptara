package NBP_Journey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectNBP {

public static void main(String[] args)  throws Throwable{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();
		driver.findElement(By.xpath("//span[text()='VIKASH1']")).click();
		driver.findElement(By.xpath("//div[@id='pagePlaceHolder1']/descendant::div[@class='size']/ancestor::div[@id='script:2304']")).click();
		driver.switchTo().frame("MsgBody");
		driver.findElement(By.xpath("//a[contains(text(),'Select a license')]")).click();
		Set<String> windowID = driver.getWindowHandles();
		List<String> windowIDsList = new ArrayList(windowID);
		for(String windid: windowIDsList)
		{
			String title= driver.switchTo().window(windid).getTitle();
			System.out.println(title);
		}
		driver.findElement(By.xpath("//button[.='Continue to license selection']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash.kumar@aptaracorp.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password-field3']")).sendKeys("Aptara@123");
		driver.findElement(By.xpath("//button[text()=' Sign in']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Agree']"));
		Thread.sleep(1000);
		ele.click();
		for(int i=0; i<=2;i++){
			  try{
				  driver.findElement(By.xpath("//span[text()='Oxford University Press Standard License']")).click();
			     break;
			  }
			  catch(Exception e){
			     
			  }
			}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement term = driver.findElement(By.xpath("//button[text()='Read License Terms']"));
		js.executeScript("arguments[0].scrollIntoView()", term);
		js.executeScript("arguments[0].click()", term);
		for(int i=0; i<=2;i++){
			  try{
	    driver.findElement(By.xpath("//div[@id='divterms']")).click();
	    driver.findElement(By.xpath("//div[@id='divwarranty']")).click();
		WebElement accept =driver.findElement(By.xpath("//button[text()='I accept ']"));
		js.executeScript("arguments[0].scrollIntoView()", accept);
		js.executeScript("arguments[0].click()", accept);
		break;
		
			  }
		 
		  catch(Exception e){
		  }
		}
		  
		
		for(int i=0; i<=2;i++){
			  try{
		driver.findElement(By.id("_AddPromobtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_promocode_")).sendKeys("R-smile");
		driver.findElement(By.xpath("//i[text()='Apply']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='Third party']")).click();
			  
		WebElement firstName=driver.findElement(By.id("PayerFirstName"));
		js.executeScript("arguments[0].scrollIntoView()", firstName);
		firstName.sendKeys("Vikash Pratap");
		WebElement lastName=driver.findElement(By.id("PayerLastName"));
		lastName.sendKeys("Singh");
		js.executeScript("arguments[0].scrollIntoView()", lastName);
		driver.findElement(By.id("Organisation")).sendKeys("Aptara company");
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("vikash@aptara.com");
		driver.findElement(By.id("exampleInputEmail2")).sendKeys("vikash@aptara.com");
		WebElement note=driver.findElement(By.id("text"));
		js.executeScript("arguments[0].scrollIntoView()", note);
		note.sendKeys("Hello Aptara Good Morning");
				  
		break;
		
			  }
		 
		  catch(Exception e){
		     //System.out.println(e.getMessage());
		  }
		}
		
	   WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
	   js.executeScript("arguments[0].scrollIntoView()", submit);
	   js.executeScript("arguments[0].click()", submit);
		 List<String> windowIDsList2 = new ArrayList(windowID);
			for(String windid: windowIDsList2)
			{
				String title= driver.switchTo().window(windid).getTitle();
				System.out.println(title);
			}
			
			for(int i=0; i<=2;i++){
				  try{
	
		driver.findElement(By.xpath("//button[text()='Sign Out']")).click();
	     break;
				  }
				  catch(Exception e){
				     //System.out.println(e.getMessage());
				  }
				}
		driver.quit();

	
			  }}
