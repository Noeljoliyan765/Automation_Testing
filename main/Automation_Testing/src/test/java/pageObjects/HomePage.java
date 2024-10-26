package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Toggle']")
	WebElement toggle;
	@FindBy(xpath = "//h1[normalize-space()='Testing Arena']")
	WebElement arenatxt;
	@FindBy(xpath = "//strong[normalize-space()='Automation Testing']")
	WebElement automationtxt;

	@FindBy(xpath = "//a[normalize-space()='Buttons']")
	WebElement button;
	@FindBy(xpath = "//a[normalize-space()='Actions']")
	WebElement actionobj;
	@FindBy(xpath = "//a[normalize-space()='Accordion']")
	WebElement accordion;
	@FindBy(xpath = "//a[normalize-space()='Browser Tabs']")
	WebElement browsertabs;
	@FindBy(xpath = "//a[normalize-space()='Contact Us Form Test']")
	WebElement contactform;
	@FindBy(xpath = "//a[normalize-space()='DropDown Checkbox Radio']")
	WebElement dropdown;
	@FindBy(xpath = "//a[normalize-space()='iFrames']")
	WebElement iframe;

	public void clicktoggle() {

		toggle.click();
	}

	public String arenatxt() {

		return arenatxt.getText();
	}

	public String automationtxt() {
		try {
			return (automationtxt.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public void button() {
		button.click();
	}

	public void action() {
		actionobj.click();
	}

	public void accordion() {
		accordion.click();
	}

	public void browsertabs() {
		browsertabs.click();
	}
	public void contactform() {
		contactform.click();
	}
	public void dropdown() {
		dropdown.click();
	}
	public void iframe() {
		iframe.click();
	}
	

}