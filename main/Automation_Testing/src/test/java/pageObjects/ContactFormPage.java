package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends BasePage {

	public ContactFormPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement fname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lname;
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement email;
	@FindBy(xpath = "//textarea[@placeholder='Comments']")
	WebElement comments;
	@FindBy(xpath = "//input[@value='SUBMIT']")
	WebElement submit;
	@FindBy(xpath = "//h3[normalize-space()='Thank you for your mail!']")
	WebElement mssg;

	public void fname() {
		fname.sendKeys("Noel");
	}

	public void lname() {
		lname.sendKeys("Jol");
	}

	public void email() {
		email.sendKeys("nj@gmail.com");
		;
	}

	public void comments() {
		comments.sendKeys("Hi there");
		;
	}

	public void submit() {
		submit.click();
	}
	
	public String mssg() {
		return mssg.getText();
	}

}
