package LoginPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import LoginBase.BasePage;

public class OppurtunityPage  extends BasePage{
	public OppurtunityPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//a[@title='Opportunities Tab']")
	WebElement OppTab;
	
	@FindBy(id="fcf")
	WebElement Oppdrpdwn;
	
	@FindBy(id="opp3")
	WebElement oppname;
	
	@FindBy(id="opp4")
	WebElement AccName;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement OppNewbtn;
	
	@FindBy(id="opp9")
	WebElement  Closeddate;
	
	@FindBy(id="opp6")
	WebElement Leadsrcdrpdwn;
	
	@FindBy(id="opp11")
	WebElement Stagedrpdwn;
	
	@FindBy(id="opp12")
	WebElement probability;
	
	@FindBy(id="opp5")
	WebElement Opptypedrpdwn;
	
	@FindBy(xpath="//input[@tabindex='18']")
	WebElement oppsavebtn;
	
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement Opppipeline;
	
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckopp;
	
	@FindBy(xpath="//select[@id='quarter_q']")
	WebElement intervaldrpdwn;
	
	@FindBy(xpath="//select[@id='open']")
	WebElement includedrpdwn;
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement runreport;
	
	public void OppurtunitiesTab() {
		OppTab.click();
	}
	public void OppDrpDwn() {
		Oppdrpdwn.click();
	}
	public void OppNewBtn() {
		OppNewbtn.click();
	}
	public void OPpName(String text) {
		oppname.sendKeys(text);
	}
	public void OppAccName(String text) {
		AccName.sendKeys(text);
	}
	public void OppClosedDate() {
		Closeddate.sendKeys("4/4/2024");
	}
	public void OppLeadSourceDrpDwn() {
		String text="Web";
		selectbyText(Leadsrcdrpdwn,text);
	}
	public void Stagedrpdwn() {
		String text="Qualification";
		selectbyText(Stagedrpdwn,text);
	}		
	public void probability(String string) {
		probability.sendKeys(string);
	}
	public void Opptypedrpdwn() {
		String text="Existing Customer - Upgrade";
		selectbyText(Opptypedrpdwn,text);
	}
	public  void OppSaveBtn() {
		oppsavebtn.click();
	}
	public void OppPipeLine() {
		WaitforElement(Opppipeline, 10);
		Opppipeline.click();
	}
	public void StuckOpp() {
		stuckopp.click();
	}
	public void OppIntervaldrpdwn() {
		WaitforElement(intervaldrpdwn, 10);
		String text="Next FQ";
		selectbyText(intervaldrpdwn,text);
	}
	public void OppInncludedrpdwn() {
		WaitforElement(includedrpdwn, 10);
		String text="Closed Opportunities";
		selectbyText(includedrpdwn,text);
	}
	public void RunReport() {
		runreport.click();
	}
}
