package LoginTestUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotutility {
	public void takescreeenshot(WebDriver driver) {
		String userDir = System.getProperty("user.dir");
		String fileseperator = System.getProperty("file.separator");
		//TakeScreen shot objects
		TakesScreenshot screenshot =((TakesScreenshot)driver);
		//store this object in a file
		File srcFile= screenshot .getScreenshotAs(OutputType.FILE);
		Date current = new Date();
		String timestamp= new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss").format(current);
		String filepath= userDir + fileseperator + "Screenshots" + fileseperator + "Salesforce"+timestamp+".jpeg"; 
		File destfile= new File (filepath);
		try 
		{
			FileUtils.copyFile(srcFile, destfile);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}
