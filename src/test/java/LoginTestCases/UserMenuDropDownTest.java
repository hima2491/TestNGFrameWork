package LoginTestCases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import LoginBase.BaseTest;
import LoginLog.Log;
import LoginPages.LoginPage;
import LoginPages.UserMenuDropDownpage;
import LoginTestUtility.PropertiesFile;
import LoginTestUtility.screenshotutility;

public class UserMenuDropDownTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile prop;
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
		DOMConfigurator.configure("log4j.xml");	 
	
	
//	     public void UserMenu() throws InterruptedException {
//		  Log.startTestCase("Login Testcase5");
		  String username=prop.getproperties("username");
		  loginpage.enterintousername(username);
		  String password =prop.getproperties("password");
		  loginpage.enterintopassword(password);
		  loginpage.ClickLogin();
		  UserMenudropDownPage.UserMenuDrpdwn();
	}
	
	@Test(priority=1)
	public void UserMenu1() throws InterruptedException {
		  Log.startTestCase("Login Testcase5");
		  String username=prop.getproperties("username");
		  loginpage.enterintousername(username);
		  String password =prop.getproperties("password");
		  loginpage.enterintopassword(password);
		  loginpage.ClickLogin();
		  UserMenudropDownPage.UserMenuDrpdwn();
	}
	@Test(priority=2)
	public void MyProfile() throws InterruptedException {
		  Log.startTestCase("Login Testcase6");
		  UserMenudropDownPage.MyProfile();
		  UserMenudropDownPage.EditBtn();
		  UserMenudropDownPage.Frame();
		  UserMenudropDownPage.aboutTab();
		  UserMenudropDownPage.LastName("Muthyala");
		  UserMenudropDownPage.SaveAll();
		  UserMenudropDownPage.Postlink();
		  UserMenudropDownPage.PostLinkFrame();
		  UserMenudropDownPage.Textarea("Hello All");
		  UserMenudropDownPage.Share();
		  UserMenudropDownPage.FileLink();
		  UserMenudropDownPage.UploadfileFromComputer();
		  String filelinkPath=prop.getproperties("filelinkpath");
		  Thread.sleep(5000);
		  UserMenudropDownPage.choosefile(filelinkPath);
		  UserMenudropDownPage.filelinkShareBtn();
		  UserMenudropDownPage.PhotosectionMouseOver();
		  UserMenudropDownPage.Updatephoto();
//		  UserMenudropDownPage.AddPhoto();
		  UserMenudropDownPage.PhotoFrame();
		  String filepath=prop.getproperties("filepath");
		  UserMenudropDownPage.fileInput(filepath);
		  UserMenudropDownPage.SaveBtn1();
		  UserMenudropDownPage.SaveBtn2();
		  
	}
	
	@Test(priority=3)
	public void MySettings() {
		Log.startTestCase("Login Testcase7");
		UserMenudropDownPage.MySettings();
		UserMenudropDownPage.Personol();
		UserMenudropDownPage.LoginHistory();
		UserMenudropDownPage.DownloadHistory();
		UserMenudropDownPage.DisplayandLayout();
		UserMenudropDownPage.customizetab();
		UserMenudropDownPage.Customapp();
		UserMenudropDownPage.Report();
		UserMenudropDownPage.AddButton();
		UserMenudropDownPage.DisplayandlayoutSaveBtn();
		UserMenudropDownPage.ContentBtnArrow();
		UserMenudropDownPage.Saleforcechatter();
		UserMenudropDownPage.ContentBtnArrow();
		UserMenudropDownPage.Contentopition();
		UserMenudropDownPage.UserMenuDrpdwn();
		UserMenudropDownPage.MySettings();
		UserMenudropDownPage.Email();
		UserMenudropDownPage.MyEmailSettings();
		UserMenudropDownPage.AutomaticBcc();
		UserMenudropDownPage.CalendersAndRemianders();
		UserMenudropDownPage.ActivityRemainders();
		UserMenudropDownPage.OpenTestReminders();
		UserMenudropDownPage.EmailSaveBtn();
		
	}
	@Test(priority=4)
	
	public void Developerconsole() throws InterruptedException {
		UserMenudropDownPage.DeveloperConsole();
		UserMenudropDownPage.PerformActionOnWindow();
		UserMenudropDownPage.SwitchtoParentWindow();
//		driver.quit();
		
	}
	@Test(priority=5)
	public void Logout() {
		loginpage.Logout();
	}
	
	@AfterTest
	public void teardown()
	 {
		screen.takescreeenshot(driver);
		close();
	 }
}

