package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author A8568
 *
 */

public class BaseClass {
	//public WebDriver driver;
	//generic utility
	//public static WebDriver sdriver;
	public FileUtility fUtil = new FileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	
    public static WebDriver driver;
	public static Properties prop;
	public static WebDriver sdriver;
	
	public BaseClass() throws Throwable{
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\A8568\\eclipse-workspace\\OUPQAScipris\\src\\main\\java\\Configuration\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
      public static void intilization() {
    	  String browserName = prop.getProperty("browser");
    	  if(browserName.equals("chrome"))
    	  {
    		  System.setProperty(IPathConstants.CHROME_KEY, IPathConstants.CHROME_PATH	);
    		  driver = new ChromeDriver();
    	  }
    	  else if(browserName.equals("Firefox"))
    	  {
    		  System.setProperty(IPathConstants.FIREFOX_KEY,IPathConstants.FIREFOX_PATH);;
    		  driver = new FirefoxDriver();
    		  
    	  }
    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
          driver.get(prop.getProperty("url"));
    	  
      }}