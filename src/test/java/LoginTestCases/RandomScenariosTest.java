package LoginTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.ContactPage;
import LoginPages.LeadsPage;
import LoginPages.LoginPage;
import LoginPages.RandomScenariosPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class RandomScenariosTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
	LeadsPage LeadsPage;
	ContactPage ContactPage;
	UserMenuDropDownpage UserMenudropDownPage;
	RandomScenariosPage RandomScenariosPage;
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
		ContactPage=new ContactPage(driver);
		RandomScenariosPage=new RandomScenariosPage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	    String username=prop.getproperties("username");
	    loginpage.enterintousername(username);
	    String password =prop.getproperties("password");
	    loginpage.enterintopassword(password);
	    loginpage.ClickLogin();
	    loginpage.Maximizedriver();
	}
	@Test
	public void firstAndLastNameClick33() {
		Log.startTestCase("Contacts Testcase33");
		RandomScenariosPage.HomeTab();
		RandomScenariosPage.firstandlastName();
	}
	@Test
	public void TestCase34() {
		Log.startTestCase("Contacts Testcase34");
		RandomScenariosPage.HomeTab();
		RandomScenariosPage.firstandlastName();
		RandomScenariosPage.EditLink();
		RandomScenariosPage.EditLinkframe();
		RandomScenariosPage.AboutTab();
		RandomScenariosPage.editLinkLastName("Abcd");
		RandomScenariosPage.EditSaveAll();
	}
	@Test
	public void TestCase35() {
		Log.startTestCase("Contacts Testcase35");
		RandomScenariosPage.AllTabs();
		RandomScenariosPage.CustomizeTabs();
		RandomScenariosPage.SelectedTabsdrpdwn("Libraries");
		RandomScenariosPage.RemoveBtn();
		RandomScenariosPage.CutomizeSAveBtn();
		loginpage.UserNavBtn();
		loginpage.Logout();
		loginpage.Login("hima@abb.com", "chindu@7022");
		loginpage.ClickLogin();
	}
	@Test
	public void TestCase36() throws InterruptedException {
		Log.startTestCase("Contacts Testcase36");
		RandomScenariosPage.HomeTab();
		RandomScenariosPage.CalenderLink();
		RandomScenariosPage.EightPmLink();
		RandomScenariosPage.SubjectCombo();
		RandomScenariosPage.Otheroption();
		RandomScenariosPage.EndTimeLink("9:30PM");
		RandomScenariosPage.CalenderSaveBtn();
	}
	@Test
	public void TestCase37() throws InterruptedException {
		Log.startTestCase("Contacts Testcase36");
		RandomScenariosPage.HomeTab();
		RandomScenariosPage.CalenderLink();
		RandomScenariosPage.FourPmLink();
		RandomScenariosPage.SubjectCombo();
		RandomScenariosPage.Otheroption();
		RandomScenariosPage.EndTimeLink("7:00PM");
		RandomScenariosPage.Recurrence();
		RandomScenariosPage.WeeklyRoundUp();
		RandomScenariosPage.RecEndDate("4/25/2024");
		RandomScenariosPage.CalenderSaveBtn();
		RandomScenariosPage.MonthView();
	}
}
