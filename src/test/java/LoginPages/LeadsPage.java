package LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import LoginBase.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Lead_Tab")
	WebElement Leadstab;
	
	@FindBy(xpath="//select[@id='fcf']")
	WebElement LeadsDrpDwn;
	
	@FindBy(xpath="//input[@title='Go!']")
	WebElement GoBtn;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement LeadsNewbtn;
	
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	
	@FindBy(id="lea3")
	WebElement company;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement LeadsSaveBtn;
	
	
	public void Leadstab() {
		WaitforElement(Leadstab, 10);
		Leadstab.click();
	}
	public void LeadsDrpDwn() {
		WaitforElement(LeadsDrpDwn, 10);
		LeadsDrpDwn.click();
	}
	 
	public void MyUnreadLeads(String text) {
		WaitforElement(LeadsDrpDwn, 10);
		selectbyText(LeadsDrpDwn,text);
	}
	
	public void TodaysLeads(String text) {
		WaitforElement(LeadsDrpDwn, 10);
		selectbyText(LeadsDrpDwn,text);
	}
	 
	public void LeadsNewbtn() {
		LeadsNewbtn.click();
	}
	public void LeadsGOBtn() {
		GoBtn.click();
	}
	
	public void LeadsNewLastName(String name) {
		lastname.sendKeys(name);
	}
	public void LeadsNewCompanyName(String name) {
		company.sendKeys(name);
	}
	public void LeadsSaveBtn() {
		LeadsSaveBtn.click();
	}

}
