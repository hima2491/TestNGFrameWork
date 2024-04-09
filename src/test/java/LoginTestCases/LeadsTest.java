package LoginTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.LeadsPage;
import LoginPages.LoginPage;
import LoginPages.OppurtunityPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class LeadsTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
	LeadsPage LeadsPage;
	UserMenuDropDownpage UserMenudropDownPage;
	screenshotutility screen=  new screenshotutility();
	
	
	@BeforeMethod
	public void BeforeMethod() {
		driver=getDriver();
		prop =new PropertiesFile();
		String url = prop.getproperties("url");
		driver.get(url);	
		loginpage = new LoginPage(driver);
		UserMenudropDownPage= new UserMenuDropDownpage(driver);
		LeadsPage=new LeadsPage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	    String username=prop.getproperties("username");
	    loginpage.enterintousername(username);
	    String password =prop.getproperties("password");
	    loginpage.enterintopassword(password);
	    loginpage.ClickLogin();
	}
	
	@Test 
	 public void LeadsTab() {
		Log.startTestCase("Leads Testcase 20");
		LeadsPage.Leadstab();
	}
	
	@Test 
	public void LeadsDrpDwn() {
		Log.startTestCase("Leads Testcase 21");
		LeadsPage.Leadstab();
		LeadsPage.LeadsDrpDwn();
	}
	
	@Test 
	public void MyUnreadLeads() {
		Log.startTestCase("Leads Testcase 22");
		LeadsPage.Leadstab();
		LeadsPage.MyUnreadLeads("My Unread Leads");
		UserMenudropDownPage.UserMenuDrpdwn();
		loginpage.Logout();
	    loginpage.Login("hima@abb.com","chindu@7022");
		loginpage.ClickLogin();
		LeadsPage.Leadstab();
		LeadsPage.LeadsGOBtn();
	}
	@Test 
	public void TodaysLeads() {
		Log.startTestCase("Leads Testcase 23");
		LeadsPage.Leadstab();
		LeadsPage.TodaysLeads("Today's Leads");
		LeadsPage.LeadsGOBtn();
	}
	@Test 
	public void NewLead() {
		Log.startTestCase("Leads Testcase 23");
		LeadsPage.Leadstab();
		LeadsPage.LeadsNewbtn();
		LeadsPage.LeadsNewLastName("ABCDE");
		LeadsPage.LeadsNewCompanyName("ABCDE");
		LeadsPage.LeadsSaveBtn();
	}
}

