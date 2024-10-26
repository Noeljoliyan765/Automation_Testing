package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionPage extends BasePage{
	
	public ActionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='col-6 col-12-medium ']//div[@id='doubleClickArea']")
	WebElement doubleclickbtn;

}
