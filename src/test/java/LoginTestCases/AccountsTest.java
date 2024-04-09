package LoginTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.AccountsPage;
import LoginPages.LoginPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class AccountsTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
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
		Accountspage = new AccountsPage(driver);
//		UserMenudropDownPage= new UserMenuDropDownpage(driver);
		DOMConfigurator.configure("log4j.xml");	 
	    String username=prop.getproperties("username");
	    loginpage.enterintousername(username);
	    String password =prop.getproperties("password");
	    loginpage.enterintopassword(password);
	    loginpage.ClickLogin();
	}
	
	@Test
	public void TestCase10() throws InterruptedException {
		Log.startTestCase("Accounts Testcase10");
		  Accountspage.AccountTab();
		  Accountspage.AccNewBtn();
		  Accountspage.AccountName("Account123");
		  Accountspage.TypedrpDown();
		  Accountspage.CutPriDrpDwn();
		  Accountspage.NewAccSaveBtn();
	  }
	@Test
	
	public void TestCase11() {
	Log.startTestCase("Accounts Testcase11");
	 Accountspage.AccountTab();
	 Accountspage.CreateNewView();
	 Accountspage.ViewName("Account2207");
	 Accountspage.UniqViewName("Account2207");
	 Accountspage.CreateViewSaveBtn();
	}
	 
	@Test
	public void TestCase12() {
		Log.startTestCase("Accounts Testcase11");
		Accountspage.AccountTab();
		Accountspage.ViewDropDown();
		Accountspage.Editlink();
		Accountspage.ViewName("Account2234");
		Accountspage.FieldDrpDwn();
		Accountspage.OperatorDrpDwn();
		Accountspage.Valuefield();
		Accountspage.AvailablefieldsDrpdwn();
		Accountspage.Addbutton();
		Accountspage.CreateViewSaveBtn();
	}
	
	 @Test
	 public void TestCase13() {
		 Log.startTestCase("Accounts Testcase13");
		 Accountspage.AccountTab();
		 Accountspage.MergeAccounts();
		 Accountspage.Inputdata("Account2491");
		 Accountspage.FindAccounts();
		 Accountspage.NextBtn();
		 Accountspage.MergeBtn();
	 }
	 @Test
	 public void TestCase14() {
		 Log.startTestCase("Accounts Testcase14");
		 Accountspage.AccountTab();
		 Accountspage.Activitywithlast30days();
		 Accountspage.dateField();
		 Accountspage.CreatedDate();
		 Accountspage.FromDate();
		 Accountspage.Todate();
		 Accountspage.UnsavedReportSaveBtn();
		 Accountspage.ReportName("Account123");
		 Accountspage.UniqueReportName("Account123");
		 Accountspage.SaveAndRunReport();
	 }
	@AfterTest
	public void teardown()
	 {
		screen.takescreeenshot(driver);
		close();
	 }
	
}
	


