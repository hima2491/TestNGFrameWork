package LoginTestCases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.LoginPage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;
public class LoginTest extends BaseTest { 
	
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
	screenshotutility screen=  new screenshotutility();
	
	@BeforeMethod
	public void BeforeMethod() {
		driver=getDriver();
		prop =new PropertiesFile();
		String url = prop.getproperties("url");
		driver.get(url);	
		loginpage = new LoginPage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	}
	@Test
	public void LoginTestcase2() throws InterruptedException {
	  Log.startTestCase("Login Testcase2");
	  String username=prop.getproperties("username");
	  loginpage.enterintousername(username);
	  Log.info("Successfully entered the username:"+ username);
	  String password =prop.getproperties("password");
	  Log.info("Successfully entered the password: "+  password);
	  loginpage.enterintopassword(password);
	  Thread.sleep(2000);
	  loginpage.ClickLogin();
	}
	
	@Test
	public void LoginTest2() throws InterruptedException {
		//sequence of steps
		Log.startTestCase("Login Testcase1");
		String username =prop.getproperties("username");
		loginpage.enterintousername(username);
		Log.info("Successfully entered the username:"+ username);
//		String password = prop.getproperties("password");
//		Log.info("Successfully entered the password: "+  password);
//		loginpage.enterintopassword(password);
		Thread.sleep(2000);
		loginpage.ClickLogin();
		loginpage.ErrorMsg();
		
	}
	@Test
	public void RememberMeTestCase() {
	Log.startTestCase("Login Testcase3");
	String username =prop.getproperties("username");
	loginpage.enterintousername(username);
	Log.info("Successfully entered the username:"+ username);
	String password = prop.getproperties("password");
	Log.info("Successfully entered the password: "+  password);
	loginpage.enterintopassword(password);
	loginpage.RememberMe();
	loginpage.ClickLogin();
	loginpage.UserNavBtn();
	loginpage.Logout();
	
	}
	
	@Test
	public void InvalidLogin() {
		Log.startTestCase("Login Testcase4A");
		String username =prop.getproperties("username");
		loginpage.enterintousername(username);
		Log.info("Successfully entered the username:"+ username);
		String password =prop.getproperties("password");
		loginpage.enterintopassword("admin12");
		Log.info("Successfully entered the password: "+  password);
		loginpage.ClickLogin();
		Log.warn("Please Enter the correct paossword");
		Log.endTestCase("TestCase is Invalid");
		
	}
	@Test
	public void forgotpassword4A() throws InterruptedException {
		Log.startTestCase("ForgotPassword TestCase4B");
		String username =prop.getproperties("username");
		loginpage.enterintousername(username);
		loginpage.Forgotpassword();
		Thread.sleep(2000);
		loginpage.Forgotpwusername(username);
		loginpage.SubmitBtn();
		
	}
	
	@Test
	public void WrongUsernameandPw4B() {
		Log.startTestCase("WrongUsernmae and Password");
		loginpage.enterintousername("12132");
		loginpage.enterintopassword("121321");
		loginpage.ClickLogin();
		
	}
	
 @AfterMethod
 public void teardown()
 {
	screen.takescreeenshot(driver);
	close();
 }

}
