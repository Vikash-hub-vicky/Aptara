package GenericUtility;


import java.util.Date;
import java.util.Random;
/**
 * 
 * @author A8568
 *
 */
public class JavaUtility {
	/**
	 * This method will return random number
	 * @return
	 */
	public  int getRandomNumber() {
		Random ran = new Random();
		int randomnumber = ran.nextInt(1000);
		return randomnumber;
	}
	/**
	 * This method will retrun system date and time
	 * @return
	 */
		public String systemDateAndTime() {
			Date date = new Date();
			String dateAndTime = date.toString();
			return dateAndTime;
		}
	}


