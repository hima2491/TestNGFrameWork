package LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import LoginBase.BasePage;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="Contact_Tab")
	WebElement contacttab;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement contactnewbtn;
	
	
	@FindBy(id="name_lastcon2")
	WebElement ContactLastname;
	
	@FindBy(xpath="//table[@class='detailList']/tbody/tr[5]/td[2]//img[@alt='Account Name Lookup (New Window)']")
	WebElement accName;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement contactsavebtn;
	
	@FindBy(xpath="//form[@id='hotlist']/table/tbody/tr[1]//select[@id='hotlist_mode']")
	WebElement recentlyFrame;
	
	@FindBy(id="fcf")
	WebElement ContactViewdrpdwn;
	
	@FindBy(xpath="//table[@class='list']/tbody/tr[2]//th[@scope='row']")
	WebElement RecentContact;
	
	@FindBy(xpath="//input[@value=' Go! ']")
	WebElement Gobtn;
	
	@FindBy(xpath="//div[@class='errorMsg']")
	WebElement errormsg;
	
	@FindBy(xpath="(//input[@value='Cancel'])[1]" )
	WebElement cancel;
	
	public void ContactTab() {
		contacttab.click();
	}
	public void ContactNew() {
		contactnewbtn.click();
	}
	
	public void ContactLastname(String name) {
		WaitforElement(ContactLastname, 10);
		ContactLastname.sendKeys(name);
	}
	public void ContactAccName(String name) {
		WaitforElement(accName, 10);
		accName.sendKeys(name);
	}
	public void ContactSavebtn() {
		contactsavebtn.click();
	}
	public void RecentlyFrame(String text) {
		WaitforElement(recentlyFrame, 10);
		Mouseover(recentlyFrame);
		selectbyText(recentlyFrame,text);
	}
	public void ContactViewDrpdwn(String text) {
		WaitforElement(ContactViewdrpdwn, 10);
		ContactViewdrpdwn.click();
		selectbyText(ContactViewdrpdwn,text );
		
	}
	public void RecentContact() {
		MouseoverDoubleclick(RecentContact);
		WaitforElement(RecentContact, 10);
		RecentContact.click();
	}
	public void ConViewDrpDwnGoBtn() {
		Gobtn.click();
	}
	public void ErrorMsg() {
		String Message=errormsg.getText();
		WaitforElement(errormsg, 10);
		System.out.println("Errro Message:" +Message );
	}
	public void CreateNewViewCanelBtn() {
		WaitforElement(cancel, 10);
		cancel.click();
	}
	
}

