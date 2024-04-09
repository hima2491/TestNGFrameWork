package LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import LoginBase.BasePage;

public class RandomScenariosPage extends BasePage {
	public RandomScenariosPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(id="home_Tab")
	WebElement homeTab;
	
	@FindBy(xpath="//div[@class='mruItem']//a[@class='userMru']")
	WebElement firstandlastname;
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
	WebElement editlink;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement frame;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement Abouttab;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@class='zen-btn zen-primaryBtn zen-pas']")
	WebElement EditSaveBtn;
	
	@FindBy(xpath="//img[@class='allTabsArrow']")
	WebElement AllTabsBtn;
	
	@FindBy(xpath="//input[@class='btnImportant']")
	WebElement Cutomizetabs;
	
	@FindBy(xpath="//select[@id='duel_select_1']")
	WebElement selectedTab;
	
	@FindBy(xpath="//img[@class='leftArrowIcon']")
	WebElement REmovebtn;
	
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement SAveBtn;
	
	@FindBy(xpath="//span[@class='pageDescription']/a")
	WebElement CurentCalender;
	
	@FindBy(xpath="//div[@id='p:f:j_id25:j_id61:28:j_id64']")
	WebElement eightpm;
	
	@FindBy(xpath="//a[@tabindex='2']")
	WebElement subjectcombo;
	
	@FindBy(xpath="//a[@href='javascript:pickValue(4);']")
	WebElement otheroption;
	
	@FindBy(xpath="//input[@id='EndDateTime_time']")
	WebElement endtime; 
	
	@FindBy (xpath="(//input[@title='Save'])[1]")
	WebElement CalenderSaveBtn;
	
	@FindBy(xpath="//div[@id='p:f:j_id25:j_id61:20:j_id64']")
	WebElement FourPm;
	
	@FindBy(xpath="//input[@id='IsRecurrence']")
	WebElement recurrance;
	
	@FindBy(xpath="//input[@id='rectypeftw']")
	WebElement WeeklyRoundup;
	
	@FindBy(xpath="//input[@id='RecurrenceEndDateOnly']")
	  WebElement ReccuranceendDate;
	
	@FindBy(xpath="//img[@class='monthViewIcon']")
	WebElement MonthView;
	
	public void HomeTab() {
		WaitforElement(homeTab, 10);
		homeTab.click();
	}
	public void firstandlastName() {
		WaitforElement(firstandlastname, 20);
		Mouseover(firstandlastname);
		firstandlastname.click();
	}
	public void EditLink() {
		WaitforElement(editlink, 20);
		Mouseover(editlink);
		editlink.click();
	}
	public void EditLinkframe() {
		SwitchtoIframe(frame);
	}
		
	public void AboutTab() {
		WaitforElement(Abouttab, 10);
		Abouttab.click();
	}
	
	public void editLinkLastName(String text) {
		WaitforElement(lastname, 10);
		lastname.clear();
		lastname.sendKeys(text);
	}
	 public void EditSaveAll() {
		 WaitforElement(EditSaveBtn , 10);
		 EditSaveBtn.click();
	 }    
	 public void AllTabs() {
		 WaitforElement(AllTabsBtn , 10);
		 AllTabsBtn.click();
	 }
	 public void CustomizeTabs() {
		 Cutomizetabs.click();
	 }
	 public void SelectedTabsdrpdwn(String text) {
		 WaitforElement(selectedTab , 10);
			selectbyText(selectedTab,text);
			}
	 public void RemoveBtn() {
		 WaitforElement(REmovebtn , 10);
		 REmovebtn.click();
	 }
	
	 public void CutomizeSAveBtn() {
		 WaitforElement(SAveBtn , 10);
		 SAveBtn.click();
	 }
	 public void CalenderLink() {
		 WaitforElement(CurentCalender , 10);
		 CurentCalender.click();
	 }
	 public void EightPmLink() {
		 WaitforElement(eightpm , 10);
		 eightpm.click();
	 }
	 public void SubjectCombo() throws InterruptedException {
		 WaitforElement(subjectcombo , 10);
		 subjectcombo.click();
		 WindowHandle(subjectcombo);
	 }
	 public void Otheroption() {
		 WaitforElement(otheroption , 10);
		 otheroption.click();
		 SwitchtoParentWindow();
	 }
	
	 public void EndTimeLink(String text) {
		 WaitforElement(endtime , 10);
		 endtime.clear();
		 endtime.sendKeys(text);
	 }
	 public void CalenderSaveBtn() {
		 WaitforElement(CalenderSaveBtn , 20);
		 Mouseover(CalenderSaveBtn);
		 CalenderSaveBtn.click();
	 }
	 
	 public void FourPmLink() {
		 WaitforElement(FourPm , 20);
		 FourPm.click();
	 }
	 public void Recurrence() {
		 RadioButton(recurrance);
	 } 
	public void WeeklyRoundUp()
	  {
	     RadioButton(WeeklyRoundup);
      } 
    public void RecEndDate(String text) {
		ReccuranceendDate.sendKeys(text);
	   }
    public void MonthView() {
			MonthView.click();
		}
		
	 }
	 
 

