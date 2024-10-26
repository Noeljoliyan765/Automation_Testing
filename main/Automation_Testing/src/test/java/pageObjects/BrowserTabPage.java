package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserTabPage extends BasePage{

	public BrowserTabPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@value='Open Tab']")
	WebElement opentab;
	
	public void opentab() {
		opentab.click();
	}
	
	
}
