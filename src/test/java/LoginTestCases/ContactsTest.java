package LoginTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.AccountsPage;
import LoginPages.ContactPage;
import LoginPages.LeadsPage;
import LoginPages.LoginPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class ContactsTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
	LeadsPage LeadsPage;
	ContactPage ContactPage;
	UserMenuDropDownpage UserMenudropDownPage;
	AccountsPage Accountspage;
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
		Accountspage = new AccountsPage(driver);
		ContactPage=new ContactPage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	    String username=prop.getproperties("username");
	    loginpage.enterintousername(username);
	    String password =prop.getproperties("password");
	    loginpage.enterintopassword(password);
	    loginpage.ClickLogin();
	}
	
	@Test
	
	public void Contactstab() {
		Log.startTestCase("Contacts Testcase25");
		ContactPage.ContactTab();
		ContactPage.ContactNew();
		ContactPage.ContactLastname("Conatact123");
		ContactPage.ContactAccName("Account123");
	}	

	@Test
	
	public void CreateNewviewcontact() {
		Log.startTestCase("Contacts Testcase26");
		ContactPage.ContactTab();
		Accountspage.CreateNewView();
		Accountspage.ViewName("Contact2207");
		Accountspage.UniqViewName("Contact2207");
		Accountspage.CreateViewSaveBtn();
	}
@Test
	public void Recentlycreated() {
		Log.startTestCase("Contacts Testcase27");
		ContactPage.ContactTab();
		ContactPage.RecentlyFrame("Recently Created");
    }
@Test
public void viewdrpdwn() {
	Log.startTestCase("Contacts Testcase28");
	ContactPage.ContactTab();
	ContactPage.ContactViewDrpdwn("My Contacts");
	ContactPage.ConViewDrpDwnGoBtn();

   }
@Test
public void RecentContact() {
	Log.startTestCase("Contacts Testcase29");
	ContactPage.ContactTab();
	ContactPage.RecentContact();
}
@Test
public void ErrorMessage() {
	Log.startTestCase("Contacts Testcase30");
	ContactPage.ContactTab();
	Accountspage.CreateNewView();
	Accountspage.UniqViewName("EFGH");
	Accountspage.CreateViewSaveBtn();
	ContactPage.ErrorMsg();
}
@Test
public void cancelBtn() {
	Log.startTestCase("Contacts Testcase31");
	ContactPage.ContactTab();
	Accountspage.CreateNewView();
	Accountspage.ViewName("ABCD");
	Accountspage.UniqViewName("EFGH");
	ContactPage.CreateNewViewCanelBtn();
}
}
