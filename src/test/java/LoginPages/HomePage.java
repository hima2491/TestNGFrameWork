package LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import LoginBase.BasePage;

public class HomePage extends BasePage { 
	 
	public HomePage(WebDriver driver) {
		super(driver);
	} 
	
	@FindBy(xpath="//a[text()='Home']")
	   WebElement hometab; 
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="lname")
	WebElement FatherName;
	
	
	public void homeTabClick() {
		WaitforElement(hometab, 10);
		hometab.click();
	}
	public void enterFirstname(String strFirstname) {
		Name.sendKeys(strFirstname);
	}
	
	public void enterFathername(String strFathername) {
		FatherName.sendKeys(strFathername);
	}
	
	}


