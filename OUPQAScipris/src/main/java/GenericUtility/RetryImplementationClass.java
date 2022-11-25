package GenericUtility;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;
/**
 * 
 * @author A8568
 *
 */

public class RetryImplementationClass implements IRetryAnalyzer {
	
	int count =0;
	int retryLimit =5;
	
	public boolean retry(ITestResult result) {
		if(count<retryLimit) {
			count++;
			return true;
		
		}
		return false;
	}

}
