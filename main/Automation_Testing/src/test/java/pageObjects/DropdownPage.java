package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {

	public DropdownPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//select[@id='cars']")
	WebElement drpdown;
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='col-4 col-12-small' and @type='checkbox']"));
	
	@FindBy(xpath = "//a[normalize-space()='Animals']")
	WebElement animal;
	@FindBy(xpath = "//a[normalize-space()='Cat']")
	WebElement cat;
	
	@FindBy(xpath = "//div[@id='outputMessage']")
	WebElement mssg;

	public void drpdown() throws InterruptedException {
		drpdown.click();

		Select drop = new Select(drpdown);

		drop.selectByIndex(2);
		Thread.sleep(1000);

		List<WebElement> elements = drop.getOptions();
		for(int i=0;i<elements.size();i++) {
			
			elements.get(i).click();
			Thread.sleep(1000);
			
		}
		
	}
	
	public void checkbox() throws InterruptedException {
		
		
		
		for(int i=0;i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();
			Thread.sleep(2000);
	}
	}
	
	public void nav() throws InterruptedException{
		
		Actions act=new Actions(driver);
		act.moveToElement(animal).moveToElement(cat).click().build().perform();
		
		Assert.assertEquals(mssg.getText(), "You clicked on menu option 'Cat'");
		
	}

}
