package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author A8568
 *
 */
public class FileUtility {
	/**
	 * this method will fetch the data from property file based on the key passed
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyFileData(String key) throws Throwable {
		FileInputStream file = new FileInputStream(IPathConstants.PROPERTY_FILEPATH);
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key);
		

}
}


