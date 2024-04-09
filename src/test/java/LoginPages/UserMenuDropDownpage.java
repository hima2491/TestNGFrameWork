package LoginPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import LoginBase.BasePage;

public class UserMenuDropDownpage extends BasePage {
	

	public UserMenuDropDownpage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="userNavButton")
	   WebElement UserMenubtn; 
	
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement MyProfilelink;
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
	WebElement Editbutton;
	
	@FindBy(id="contactInfoContentId")
	WebElement frame;
	
	@FindBy(id="aboutTab")
	WebElement Abouttab;
	
	@FindBy(xpath="//input[@class='lastName zen-inputFull zen-input']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveAll;
	
	@FindBy(xpath="//a[@id='publisherAttachTextPost']")
	WebElement PostLink;
	
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement Postlinkframe;
	
	@FindBy(xpath="/html/body")
	WebElement TextArea;
	
	@FindBy(xpath="//span[@class='publisherShareButtonPlaceholder']")
	WebElement share;

	@FindBy(xpath="//div[@id='photoSection']")
	WebElement MouseOveronPhotSection;
	
	
	@FindBy(xpath="//a[contains(text(),'Add Photo')]")
	WebElement Addphoto;
	
	@FindBy(id="uploadPhotoContentId")
	WebElement photoframe;
	
	@FindBy(className="fileInput")
	WebElement Inputfile;
	
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	WebElement saveBtn1;
	
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	WebElement savebtn2;
	
    @FindBy(xpath="//a[@id='deletePhoto']")
    WebElement DeletePhoto;
    @FindBy(xpath="//a[@id='uploadLink']")
    WebElement updatephoto;
	
	@FindBy(xpath="//a[contains(text(),'Add Photo')]")
	WebElement addphoto;
	
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettings;
	
	@FindBy(id="PersonalInfo_font")
	WebElement Personol;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginhistory;
	
	@FindBy(xpath="//div[@class='pShowMore']")
	WebElement downloadhistory;
	
	@FindBy(id="DisplayAndLayout_font")
	WebElement disandlayout;
	
	@FindBy(id="CustomizeTabs_font")
	WebElement CustomizeTabs;
	
	@FindBy(id="p4")
	WebElement customapp;
	
	@FindBy(xpath="//option[@value='report']")
	WebElement Report;
	
	@FindBy(xpath="//img[@class='rightArrowIcon']")
	WebElement Addbtn;
	
	@FindBy(name="save")
	WebElement saveBtn;
	
	@FindBy(id="tsid-arrow")
	WebElement ContentBtn;
	
	@FindBy(xpath="//a[contains(text(),'Salesforce Chatter')]")
	WebElement salesforceChatter;
	
	@FindBy(xpath="//a[contains(text(),'Content')]")
	WebElement contentoption;
	
	@FindBy(xpath="//div[@id='EmailSetup']")
	WebElement email;
	
	@FindBy(id="EmailSettings_font")
	WebElement emailsettings;
	
	@FindBy(name="auto_bcc")
	WebElement AutomaticBcc;
	
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement Savebtn;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement CalAndRemfont;
	
	@FindBy(id="Reminders_font")
	WebElement Remfont;
	
	@FindBy(xpath="//input[@value='Open a Test Reminder']")
	WebElement OpenTestRemainders;

	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	WebElement developerconsole;
	
	@FindBy(xpath="//span[text()='File']")
	WebElement filelink;
	
	@FindBy(xpath="//a[@id='chatterUploadFileAction']")
	WebElement uploadfileformcomputer;
	
	@FindBy(xpath="//input[@id='chatterFile']")
	WebElement Choosefile;
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement filelinkSAveBtn;
	
	 public void UserMenuDrpdwn() {
		 UserMenubtn.click();
	 }
	 
	 public void MyProfile() {
		 MyProfilelink.click();
	 }
	 
	 public void EditBtn() {
		 Editbutton.click();
	 }
	 
	 public void Frame() {
		 driver.switchTo().frame(frame);
	 }
	 public void aboutTab() {
		 Abouttab.click();
	 }
	 
	 public void LastName(String strlastname) {
		 lastname.clear();
		 lastname.sendKeys(strlastname);
	 }
	 public void SaveAll() {
		 saveAll.click();
		  driver.switchTo().defaultContent();
	 }
	 public void Postlink() {
		 PostLink.click();
	 }
	 public void PostLinkFrame() {
		 driver.switchTo().frame(Postlinkframe);
	 }
	 
	 public void Textarea(String Text) {
		 TextArea.click();
		 TextArea.sendKeys(Text); 
		 driver.switchTo().defaultContent();
	 }
	 
	 public void Share() {
		 share.click();
	 }
	
	public void PhotosectionMouseOver() {
		Actions actions=new Actions(driver);
		actions.moveToElement(MouseOveronPhotSection).build().perform();
	}
	
	 public void Deletephoto() {
		 DeletePhoto.click();
	 }
	 public void Updatephoto() {
		 updatephoto.click(); 
	 }
	 
	
	public void AddPhoto() {
		addphoto.click();
	}
	 public void PhotoFrame() {
		 driver.switchTo().frame(photoframe);
	 }
	 public void fileInput(String filepath) {
		 Inputfile.sendKeys(filepath);
	 }
	
    public void SaveBtn1() {
    	  WaitforElement(saveBtn1, 5);
		  saveBtn1.click();
	  }
    
	  public void SaveBtn2() {
		  WaitforElement(savebtn2, 5);
		   savebtn2.click();
	  }
	  public void MySettings() {
		MySettings.click();
	  }
	  public void Personol() {
		  Personol.click();  
	  }
	  public void LoginHistory () {
		  loginhistory.click();
	  }
	  public void DownloadHistory() {
		  downloadhistory.click();
	  }
	  
	  public void DisplayandLayout() {
		  disandlayout.click();
	  }
	  public void customizetab() {
	  CustomizeTabs.click();
	  }
	  public void Customapp() {
		 Select saleschatter= new Select(customapp);
		saleschatter.selectByVisibleText("Salesforce Chatter");
	  }
	  public void Report() {
		  Report.click();  
	  }
	  public void AddButton() {
		  Addbtn.click();
	  }
	  public void DisplayandlayoutSaveBtn() {
		  saveBtn.click();  
	  }
	  public void ContentBtnArrow() {
		  ContentBtn.click();
	  }
	  public void Saleforcechatter() {
		  salesforceChatter.click();
	  }
	  public  void Contentopition() {
		  contentoption.click();
	  }
	  public void Email() {
		  WaitforElement(email, 10);
		  email.click();
	  }
	  public void MyEmailSettings() {
		  emailsettings.click();
		  WaitforElement(emailsettings, 5);
	  }
	  public void AutomaticBcc() {
		  WaitforElement(AutomaticBcc, 5);
		  if(!AutomaticBcc.isSelected()) {
				AutomaticBcc.click();
			}
	  }
	  public void EmailSaveBtn() {
		  Savebtn.click();
	  }
	  public void CalendersAndRemianders() {
		  CalAndRemfont.click();
	  }
	  public void  ActivityRemainders() {
		  Remfont.click();
	  }
	  public void OpenTestReminders() {
		  OpenTestRemainders.click();
	  }
	  
	  public void DeveloperConsole() throws InterruptedException {
		  developerconsole.click();
		  WindowHandle(developerconsole);
//		  String ParentWindow=driver.getWindowHandle();
//		  System.out.println("Parent window handle" +ParentWindow);
//			Set<String>listofHandles=driver.getWindowHandles();
//			System.out.println("total windows opened currently"+ listofHandles.size());
//			for(String Handle:listofHandles)
//			{
//				System.out.println("Current window Handle" +Handle);
//				if(!Handle.equals(ParentWindow)) {
//					driver.switchTo().window(Handle);//switching to new window
//					Thread.sleep(3000);
//					driver.close();
//					break;
//				}
//			}
//			driver.switchTo().window(ParentWindow);
	  }
	  
	  public void PerformActionOnWindow() {
		  String Title= driver.getTitle();
		  System.out.println("Title ofWindow "+ Title );
		  driver.close();
		  
	  }
	  public void FileLink() {
		  WaitforElement(filelink, 5);
			filelink.click();
		}
	  
	  public void UploadfileFromComputer() {
		  WaitforElement(uploadfileformcomputer, 5);
		  uploadfileformcomputer.click();
	  }
	  public void choosefile(String filelinkpath) {
		  WaitforElement(Choosefile, 30);
		  Choosefile.sendKeys(filelinkpath);
	  }
	  public void filelinkShareBtn() {
		  WaitforElement(filelinkSAveBtn, 10);
		  filelinkSAveBtn.click();
	  }
	  
}
