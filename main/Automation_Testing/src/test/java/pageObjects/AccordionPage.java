package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends BasePage{
	
	public AccordionPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//div[normalize-space()='Platform Portability']")
	public WebElement platform;
	
	@FindBy(xpath = "//div[normalize-space()='Language Support']")
	public WebElement language;
	
	@FindBy(xpath = "//div[normalize-space()='Selenium Grid']")
	public WebElement grid;
	
	@FindBy(xpath = "//div[normalize-space()='Testing is a repetitive process. The slightest modification in code must be tested to ensure that the software is providing the desired functionality and result. Repeating tests manually is a time consuming and costly process. Automated tests can be run repetitively at no additional costs. Selenium is a highly portable tool that runs on multiple platforms as well as browsers. It therefore allows automation engineers the ease of writing code without worrying about the platform on which it will run.']")
	public WebElement text;
	
	
	public void platform() {
		platform.click();
	}
	public void language() {
		language.click();
	}
	public void grid() {
		
		grid.click();
	}
	
	

}
