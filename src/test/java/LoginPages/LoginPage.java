package LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import LoginBase.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="username")
	   WebElement username; 
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	@FindBy(xpath="//div[@id='error']")
	WebElement Error;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id="un")
	WebElement forgotpwusername;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement Rememberme;
	
	@FindBy(id="userNavButton")
	WebElement UserNavBtn;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
			
	public void Login(String strusername, String strpassword) {
		WaitforElement(username, 10);
		username.sendKeys(strusername);
		WaitforElement(password, 10);
		password.sendKeys(strpassword);
	}
	
	public void enterintousername(String strusername) {
		username.sendKeys(strusername);
	}
	
	public void enterintopassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	
	public void ErrorMsg() {
		Error.getText();
			
	}
	public void RememberMe() {
		if(!Rememberme.isSelected()) {
			Rememberme.click();
			System.out.println("Rememeberme is checked");
		}
	}
	 public void Forgotpassword() {
		 forgotpassword.click();
	 }
	 
	 public void Forgotpwusername(String username) {
		 forgotpwusername.sendKeys(username);
	 }
	public void SubmitBtn() {
		submit.click();
	}
	public void ClickLogin() {
		WaitforElement(login, 5);
		login.click();
		
	}
	
	public void UserNavBtn() {
		UserNavBtn.click();
	}
	public void Logout() {
		logout.click();
	}
	
}
