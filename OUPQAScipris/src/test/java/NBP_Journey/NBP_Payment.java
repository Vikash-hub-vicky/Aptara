package NBP_Journey;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NBP_Payment {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();
		driver.findElement(By.xpath("//span[text()='OUPQA']")).click();
		driver.findElement(By.xpath("//div[@id='pagePlaceHolder1']/descendant::div[@class='size']/ancestor::div[@id='script:43813']")).click();
		driver.switchTo().frame("MsgBody");
		driver.findElement(By.xpath("//a[contains(text(),'Review payment request')]")).click();
		Set<String> windowID = driver.getWindowHandles();
		List<String> windowIDsList = new ArrayList(windowID);
		for(String windid: windowIDsList)
		{
			String title= driver.switchTo().window(windid).getTitle();
			System.out.println(title);
		}
		driver.findElement(By.xpath("//label[contains(text(),'Accept and proceed to payment')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement continueNBP = driver.findElement(By.xpath("//button[text()='Continue']"));
		js.executeScript("arguments[0].scrollIntoView()", continueNBP);
		js.executeScript("arguments[0].click()", continueNBP);
		Thread.sleep(2000);
		String inputText = "vikash@aptara.com";
		WebElement myElement = driver.findElement(By.xpath("//input[@type='email']"));
		String js1 = "arguments[0].setAttribute('value','"+inputText+"')";
		((JavascriptExecutor) driver).executeScript(js1, myElement);
//		WebElement nbpUser= driver.findElement(By.xpath("//input[@type='email']"));
//		nbpUser.sendKeys("vikash@aptara.com");
		Thread.sleep(2000);
		WebElement nbpPass=driver.findElement(By.xpath("//input[@type='password']"));
		nbpPass.sendKeys("Vicky999");
		driver.findElement(By.id("_login")).click();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Agree']"));
		Thread.sleep(1000);
		ele.click();
		for(int i=0; i<=2;i++){
			  try{
		WebElement billingPage = driver.findElement(By.xpath("//button[.='Continue to invoice']"));
		js.executeScript("arguments[0].scrollIntoView()", billingPage);
		js.executeScript("arguments[0].click()", billingPage);
		break;
		}
		 
		  catch(Exception e){
		     //System.out.println(e.getMessage());
		  }
		}
		for(int i=0; i<=2;i++){
			  try{
		WebElement previewInvoice = driver.findElement(By.xpath("//label[@for='checkbox5b']/ancestor::div[@id='__invoicePreview']/descendant::input[@alt='term and condition']"));
		js.executeScript("arguments[0].scrollIntoView()", previewInvoice);
		js.executeScript("arguments[0].click()", previewInvoice);
		
		//Pay By Card
		WebElement payByCard = driver.findElement(By.xpath("//button[text()='Pay by card']"));
		js.executeScript("arguments[0].scrollIntoView()", payByCard);
		js.executeScript("arguments[0].click()", payByCard);
		
		//send Invoice
//		WebElement sendInvoice = driver.findElement(By.xpath("//button[text()='Send invoice']"));
//		js.executeScript("arguments[0].scrollIntoView()", sendInvoice);
//		js.executeScript("arguments[0].click()", sendInvoice);
		  break;
			
	    }
          catch(Exception e){
                //System.out.println(e.getMessage());
              }
                  }
		List<String> windowIDsList1 = new ArrayList(windowID);
		for(String windid: windowIDsList1)
			{
				String title= driver.switchTo().window(windid).getTitle();
				System.out.println(title);
			}
	    driver.switchTo().frame("iframe_pay");
   	    WebElement zipCord = driver.findElement(By.xpath("//div[@id='billing_details']/descendant::input[@id='bill_to_address_postal_code']"));
		js.executeScript("arguments[0].scrollIntoView()", zipCord);
  	    zipCord.sendKeys("123456");
		driver.findElement(By.xpath("//label[text()='Visa']")).click();
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4111111111111111");
		//select
		WebElement month=driver.findElement(By.id("card_expiry_month"));
		month.click();
		Select select = new Select(month);
		select.selectByValue("03"); 
		WebElement year=driver.findElement(By.id("card_expiry_year"));
		year.click();
		Select select1 = new Select(year);
		select1.selectByValue("2025");
		driver.findElement(By.xpath("//input[@id='card_cvn']")).sendKeys("123");
		WebElement pay = driver.findElement(By.name("commit"));
		js.executeScript("arguments[0].scrollIntoView()", pay);
		js.executeScript("arguments[0].click()", pay);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		List<String> windowIDsList2 = new ArrayList(windowID);
			for(String windid: windowIDsList2)
			{
				String title= driver.switchTo().window(windid).getTitle();
				System.out.println(title);
			}
			
			for(int i=0; i<=2;i++){
				  try{
	
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	     break;
				  }
				  catch(Exception e){
				     //System.out.println(e.getMessage());
				  }
				}
		driver.quit();
	}
	
}
