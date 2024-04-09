package LoginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginBase.BaseTest;
import LoginPages.HomePage;
import LoginPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest extends BaseTest {
	
	WebDriver driver; 
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void BeforeMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		loginpage = new LoginPage(driver);
		homepage=new HomePage(driver); 
	}
	
	@Test
	public void testfirstandlastname() {
		//sequence of steps
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin123");
		loginpage.ClickLogin();
		homepage.homeTabClick();
		homepage.enterFirstname("himabindhu");
		homepage.enterFathername("Nagaraju");
	}
	
	@Test
	public void testlastname() {
		//sequence of steps
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin123");
		loginpage.ClickLogin();
		homepage.homeTabClick();
		homepage.enterFathername("Nagaraju");
	}	
	 @AfterMethod
	 public void teardown() {
		close();
		
	 }
 }

	

