package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IFramePage extends BasePage{
	
	public IFramePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "frame[@src='index.html'")
	WebElement frame1;
	
	@FindBy(xpath = "frame[@src='https://www.youtube.com/embed/jNQXAC9IVRw']")
	WebElement frame2;
	
	@FindBy(xpath = "//h1[normalize-space()='Testing Arena']")
	WebElement frame1mssg;
	
	@FindBy(xpath = "//button[@title='Play']")
	WebElement playbtn;
	
	
	public void frame1() {
		
		driver.switchTo().frame(frame1);
		Assert.assertEquals(frame1mssg.getText(), "Testing Arena");
	}
	
	public void frame2() {
		
		
		driver.switchTo().frame(frame2);
		playbtn.click();
		
		}

}
