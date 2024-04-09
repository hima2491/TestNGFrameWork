package LoginTestUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileinput;

	public String getproperties(String key ) {
		String userDir = System.getProperty("user.dir");
		String fileseperator = System.getProperty("file.separator");
		String filepath = userDir + fileseperator + "properties" + fileseperator + "applicationproperties.txt";
		System.out.println(filepath);
		

		// 2. Load this path into the file objcet
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// Todo Auto-geenrated catch block
			e.printStackTrace();
		}
		// 3.Create the Object as Property file
		Properties prop = new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-geenrated catch block
			e.printStackTrace();
		}
		// 4.Fetch the data from the property file
		String value = prop.getProperty(key);
		return value;
	}

	
}
