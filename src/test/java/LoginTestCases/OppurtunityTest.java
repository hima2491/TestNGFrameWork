package LoginTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.AccountsPage;
import LoginPages.LoginPage;
import LoginPages.OppurtunityPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class OppurtunityTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
	OppurtunityPage OppurtunityPage;
	screenshotutility screen=  new screenshotutility();
	
	
	@BeforeMethod
	public void BeforeMethod() {
		driver=getDriver();
		prop =new PropertiesFile();
		String url = prop.getproperties("url");
		driver.get(url);	
		loginpage = new LoginPage(driver);
		OppurtunityPage = new OppurtunityPage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	    String username=prop.getproperties("username");
	    loginpage.enterintousername(username);
	    String password =prop.getproperties("password");
	    loginpage.enterintopassword(password);
	    loginpage.ClickLogin();
	}
	@Test
	public void TestCase15() {
		Log.startTestCase("oppurtunity Testcase15");
		OppurtunityPage.OppurtunitiesTab();
		OppurtunityPage.OppDrpDwn();
    }
	@Test
	public void TestCase16() {
		Log.startTestCase("oppurtunity Testcase16");
		OppurtunityPage.OppurtunitiesTab();
		OppurtunityPage.OppNewBtn();
		OppurtunityPage.OPpName("Opp2207");
		OppurtunityPage.OppAccName("Opp2207");
		OppurtunityPage.OppClosedDate();
		OppurtunityPage.OppLeadSourceDrpDwn();
		OppurtunityPage.Stagedrpdwn();
		OppurtunityPage.probability("0.25");
		OppurtunityPage.Opptypedrpdwn();
		OppurtunityPage.OppSaveBtn();
	}
	
	@Test
	public void TestCase17() {
		Log.startTestCase("oppurtunity Testcase17");
		OppurtunityPage.OppurtunitiesTab();
		OppurtunityPage.OppPipeLine();
	}
	
	@Test
	public void TestCase18() {
		Log.startTestCase("oppurtunity Testcase18");
		OppurtunityPage.OppurtunitiesTab();
		OppurtunityPage.StuckOpp();
	}
	@Test
	public void TestCase19() {
		Log.startTestCase("oppurtunity Testcase19");
		OppurtunityPage.OppurtunitiesTab();
		OppurtunityPage.OppIntervaldrpdwn();
		OppurtunityPage.OppInncludedrpdwn();
		OppurtunityPage.RunReport();	
	}

	@AfterTest
	public void teardown()
	 {
		screen.takescreeenshot(driver);
		close();
	 }
}
