package LoginBase;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public Select select;
	public Actions actions;
	public BasePage(WebDriver driver) {
		this.driver=(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void  Maximizedriver() {
		driver.manage().window().maximize();
	}
	public void WaitforElement(WebElement element, int num) 
	{	
	WebDriverWait wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	 public void  WindowHandle(WebElement element) throws InterruptedException {
		  String ParentWindow=driver.getWindowHandle();
		  System.out.println("Parent window handle" +ParentWindow);
			Set<String>listofHandles=driver.getWindowHandles();
			System.out.println("total windows opened currently"+ listofHandles.size());
			for(String Handle:listofHandles)
			{
				System.out.println("Current window Handle" +Handle);
				if(!Handle.equals(ParentWindow)) {
					driver.switchTo().window(Handle);//switching to new window
				}
			}
	     }
	 
	 public void  SwitchtoIframe(WebElement element) {
	 driver.switchTo().frame(element);
	 }
	 public void  SwitchtoDefaultContent() {
		 driver.switchTo().defaultContent();
	 }
	 public void closecurrentwindow() {
		 driver.close();
	 }
	 
	 public void  SwitchtoParentWindow() {
		 String ParentWindow=driver.getWindowHandles().iterator().next();
		 driver.switchTo().window(ParentWindow);
	 }
	 public void Dropdown( WebElement  element) {
		  select = new Select(element);
	 }
	  public void selectbyText(WebElement element, String text) {
		   select = new Select(element);
		   select.selectByVisibleText(text);
	  }
	  public void selectbyindex(WebElement element, int num) {
		  select = new Select(element);
		   select.selectByIndex(num);
	  }
	  public void selectbyvalue(WebElement element,String value) {
		  select = new Select(element);
		   select.selectByValue(value);
	  }
	  public void Mouseover(WebElement element) {
		  actions=new Actions(driver);
		  actions.moveToElement(element).build().perform();
	  }
	  public void MouseoverDoubleclick(WebElement element) {
		  actions=new Actions(driver);
		  actions.doubleClick(element).build().perform();
	  }
	  public void RadioButton(WebElement element)
	  {
			 if(!element.isSelected()) {
				 element.click();
					System.out.println("element is checked");
				}
	  }
  }


