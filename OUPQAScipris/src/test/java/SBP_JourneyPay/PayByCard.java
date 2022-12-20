package SBP_JourneyPay;

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

public class PayByCard {
	public static void main(String[] args)  throws Throwable{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://webmailmd.aptaracorp.com/");
		driver.findElement(By.xpath("//input[@id='User']")).sendKeys("vikash.kumar@aptaracorp.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pas#mli%9313");
		driver.findElement(By.xpath("//button[@id='Logon']")).click();
		driver.findElement(By.xpath("//span[text()='VIKASH1']")).click();
		driver.findElement(By.xpath("//div[@id='pagePlaceHolder1']/descendant::div[@class='size']/ancestor::div[@id='script:2217']")).click();
		driver.switchTo().frame("MsgBody");
		driver.findElement(By.xpath("//a[contains(text(),'Select a license')]")).click();
		Set<String> windowID = driver.getWindowHandles();
////		Iterator<String> it = windowID.iterator();
////		String parentID = it.next();
////		String childID = it.next();
////		System.out.println("Parent Id:"+ parentID);
////		System.out.println("Child Id:"+ childID);
		
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
		//public void StaleElementExceptionMethod() {
//		
//	        try {
//	            // this method will throw StaleElement exception
//	        	driver.findElement(By.xpath("//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")).click();
//	        } 
//	        catch (StaleElementExceptionMethod e) 
//	        {
//	        	e.printStackTrace();
//	        	//driver.findElement(By.xpath("//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")).click();
//	        }
		for(int i=0; i<=2;i++){
			  try{
				  driver.findElement(By.xpath("//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")).click();
			     break;
			  }
			  catch(Exception e){
			     //System.out.println(e.getMessage());
			  }
			}
		

		
		//driver.findElement(By.xpath("//div[@class='line-text-div']/ancestor::div[@id='divlicense']/descendant::span[text()='Open Access CC BY License']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500);");
		//js.executeScript("scroll(0,200)");
		
		WebElement term = driver.findElement(By.xpath("//button[text()='Read License Terms']"));
		js.executeScript("arguments[0].scrollIntoView()", term);
		//term.click();
		 js.executeScript("arguments[0].click()", term);
		for(int i=0; i<=2;i++){
			  try{
	    driver.findElement(By.xpath("//div[@id='divterms']")).click();
	    driver.findElement(By.xpath("//div[@id='divwarranty']")).click();
		WebElement accept =driver.findElement(By.xpath("//button[text()='I accept ']"));
		js.executeScript("arguments[0].scrollIntoView()", accept);
		//accept.click();
		js.executeScript("arguments[0].click()", accept);
//		js.executeScript("window.scrollBy(0,30)", "");
         break;
		
			  }
		 
		  catch(Exception e){
		  }
		}
		  
		
		for(int i=0; i<=2;i++){
			  try{
		//WebElement selfPay = driver.findElement(By.xpath("//strong[contains(text(),'I Will Pay')]"));
	    WebElement selfPay = driver.findElement(By.xpath("//input[@id='nopub_self']"));
     	js.executeScript("arguments[0].scrollIntoView()", selfPay);
	    js.executeScript("arguments[0].click()", selfPay);
		
//		selfPay.click();
		//js.executeScript("document.getElementById('nopub_self').clcik()");		  
		break;
		
			  }
		 
		  catch(Exception e){
		     //System.out.println(e.getMessage());
		  }
		}
		
	
//		js.executeScript("window.scrollBy(0,450)", "");
	        driver.findElement(By.xpath("//button[text()='Continue']")).click();
//		js.executeScript("window.scrollBy(0,550)", "");
		for(int i=0; i<=2;i++){
			  try{
		WebElement billingPage = driver.findElement(By.xpath("//button[.='Continue to invoice']"));
		js.executeScript("arguments[0].scrollIntoView()", billingPage);
		js.executeScript("arguments[0].click()", billingPage);
		//billingPage.click();
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
		
		//Thread.sleep(2000);
		driver.switchTo().frame("iframe_pay");
     	WebElement zipCord = driver.findElement(By.xpath("//div[@id='billing_details']/descendant::input[@id='bill_to_address_postal_code']"));
		//WebElement zipCord = driver.findElement(By.xpath("//div[@id='billing_details']/descendant::input[@type='text'][6]"));
    	js.executeScript("arguments[0].scrollIntoView()", zipCord);
//		//js.executeScript("arguments[0].click()", zipCord);
		//js.executeScript("document.getElementByID('bill_to_address_postal_code’).value ='123456'");
		//js.executeScript("arguments[0].value='12456';", zipCord);
    	zipCord.sendKeys("123456");
		
		driver.findElement(By.xpath("//label[text()='Visa']")).click();
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4111111111111111");
		//select
		
		WebElement month=driver.findElement(By.id("card_expiry_month"));
		month.click();
		//Thread.sleep(3000);
		Select select = new Select(month);
		select.selectByValue("03");
		//Thread.sleep(2000);
		WebElement year=driver.findElement(By.id("card_expiry_year"));
		year.click();
		//Thread.sleep(3000);
		Select select1 = new Select(year);
		select1.selectByValue("2025");
		
		driver.findElement(By.xpath("//input[@id='card_cvn']")).sendKeys("123");
//		driver.findElement(By.xpath("//input[@name='commit']")).click();
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
