package LoginPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import LoginBase.BasePage;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="Account_Tab")
	WebElement Accounttab;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement AccNewBtn;
	
	@FindBy(id="acc2")
	WebElement Accname;
	
	@FindBy(id="acc6")
	WebElement typedropdown;
	
	@FindBy(id="00Nak0000011npK")
	WebElement cutpridrpdwn;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement NewAccSaveBtn;
	
	 @FindBy(xpath="//a[text()='Create New View']")
	 WebElement CreateNewview;
	  
	 @FindBy(id="fname")
	 WebElement  ViewName;
	 
	 @FindBy(id="devname")
	 WebElement UniqueName;
	 
	 @FindBy(xpath="//input[@data-uidsfdc= '4']")
	 WebElement CreateviewSaveBtn;
	 
	 @FindBy(id="fcf")
	 WebElement Viewdrpdwn;
	 
	 @FindBy(xpath="//a[text()='Edit']")
	 WebElement editlink;
	 
	 @FindBy(id="fcol1")
	 WebElement fielddrpdwn ;
	  
	 @FindBy(id="fop1")
	 WebElement Operator;
	 
	 @FindBy(id="fval1")
	 WebElement Valuefield; 
	 
	 @FindBy(id="colselector_select_0")
	 WebElement Availabelfields;
	 
	 @FindBy(xpath="//img[@title='Add']")
	 WebElement Addbtn;
	 
	 @FindBy(xpath="//a[@ href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']")
	 WebElement  Merge;
	 
	 @FindBy(id="srch")
	 WebElement Inputdata;
	 
	 @FindBy(xpath="//input[@value='Find Accounts']")
	 WebElement findaccounts;
	 
	 @FindBy(xpath="//input[@name='goNext']")
	 WebElement NextBtn;
	 
	 @FindBy(xpath="(//input[@name='save'])[2]")
	 WebElement MergeBtn;

	 @FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
	 WebElement Activity;
	 
	 @FindBy(xpath="//input[@id='ext-gen20']")
	 WebElement Datefield;
	 
	 @FindBy(xpath="//div[text()='Created Date']")
	 WebElement CreateDate;
	 
	 @FindBy(xpath="//input[@name='startDate']")
	 WebElement FromDate;
	 
	 @FindBy(xpath="//input[@name='endDate']")
	 WebElement ToDate;
	 
	 @FindBy(id="ext-gen49")
	 WebElement SaveBtn;
	 
	 @FindBy(xpath="//input[@id='saveReportDlg_reportNameField']")
	 WebElement reportname; 
	 
	 @FindBy(xpath="//input[@id='saveReportDlg_DeveloperName']")
	 WebElement unireportname;
	 
	 @FindBy(xpath="//table[@id='dlgSaveAndRun']/tbody/tr[2]/td[2]")
	 WebElement saveandrun;
	 
	public void AccountTab() {
		WaitforElement(Accounttab, 20);
		 Accounttab.click();
	}
	public void AccNewBtn() {
		WaitforElement(AccNewBtn, 20);
		AccNewBtn.click();
	}
	public void AccountName(String name) {
		WaitforElement(Accname, 10);
		Accname.sendKeys(name);
	}
	public void TypedrpDown() {
		WaitforElement(typedropdown, 10);
		String text = "Technology Partner";
		selectbyText(typedropdown,text);
//		Select type =new Select(typedropdown);
//		type.selectByVisibleText("Technology Partner");
	}
	public void CutPriDrpDwn() {
		WaitforElement(cutpridrpdwn, 10);
		String text = "High";
		selectbyText(cutpridrpdwn, text);
	}
	public void NewAccSaveBtn() {
		WaitforElement(NewAccSaveBtn, 10);
		NewAccSaveBtn.click();
	}
	public void CreateNewView() {
		WaitforElement(CreateNewview, 10);
		CreateNewview.click();
	}
	public void ViewName(String Viewname) {
		WaitforElement(ViewName, 10);
		ViewName.clear();
		 ViewName.sendKeys(Viewname);
	}
	public void UniqViewName(String UniName) {
		WaitforElement(UniqueName, 10);
		UniqueName.clear();
		UniqueName.sendKeys(UniName); 
	}
	public void CreateViewSaveBtn() {
		CreateviewSaveBtn.click();
	}
	public void ViewDropDown() {
		WaitforElement(Viewdrpdwn, 10);
		selectbyText(Viewdrpdwn,"Account2207");
	}
	public void Editlink() {
		editlink.click();
	}
	public void FieldDrpDwn() {
		WaitforElement(fielddrpdwn, 10);
		selectbyText (fielddrpdwn,"Account Name");
	}
	public void OperatorDrpDwn() {
		WaitforElement(Operator, 10);
		selectbyText (Operator,"equals");
	}
	public void Valuefield() {
		WaitforElement(Valuefield, 10);
		Valuefield.sendKeys("a");
	}
	public void AvailablefieldsDrpdwn() {
		WaitforElement(Availabelfields, 10);
		selectbyText(Availabelfields,"Last Activity");
	}
	public void Addbutton() {
		Addbtn.click();
	}
	
	public void MergeAccounts() {
		Merge.click();
	}
	public void Inputdata(String text) {
		WaitforElement(Inputdata, 10);
		Inputdata.sendKeys(text);
	}
	public void FindAccounts() {
		WaitforElement(findaccounts, 10);
		findaccounts.click();
	}
	public void NextBtn() {
		WaitforElement(NextBtn, 10);
		NextBtn.click();
	}
	public void MergeBtn() {
		MergeBtn.click();
		 Alert alertOb=driver.switchTo().alert();
//		 WaitforElement(MergeBtn, 10);
		 alertOb.accept(); 
		 WaitforElement(MergeBtn, 10);
	}
	public void Activitywithlast30days() {
		Activity.click();
	}
	public void dateField() {
		Datefield.click();
	}
	public void CreatedDate() {
		WaitforElement(CreateDate, 10);
		CreateDate.click();
		
	}
	public void FromDate() {
		WaitforElement(FromDate, 10);
		FromDate.sendKeys("3/23/2024");
	}
	public void Todate() {
		WaitforElement(ToDate, 10);
		ToDate.sendKeys("4/4/2024");
	}
	public void UnsavedReportSaveBtn() {
		WaitforElement(SaveBtn, 10);
		SaveBtn.click();
	}
	public void ReportName(String  name) {
		WaitforElement(reportname, 10);
		reportname.sendKeys(name);
	}
	public void UniqueReportName(String  name) {
		WaitforElement(unireportname, 10);
		unireportname.sendKeys(name);
	}
	public void SaveAndRunReport() {
		WaitforElement(saveandrun, 10);
		saveandrun.click();  
	}
}
