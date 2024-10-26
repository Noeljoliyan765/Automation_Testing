package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC002_ActionPageTest extends BaseClass{

	@Test
	public void actionvalidation() throws InterruptedException{

		
		HomePage hp = new HomePage(driver);

		Thread.sleep(2000);
		hp.clicktoggle();
		Thread.sleep(2000);
		hp.action();
		
		WebElement doubleclickbtn=driver.findElement(By.xpath("//div[@class='col-6 col-12-medium ']//div[@id='doubleClickArea']"));
		
		Actions action=new Actions(driver);
		action.doubleClick(doubleclickbtn).perform();
		
		System.out.println(doubleclickbtn.getText());
	}

}
