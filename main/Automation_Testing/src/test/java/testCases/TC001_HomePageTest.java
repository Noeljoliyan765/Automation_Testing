package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ButtonPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomePageTest extends BaseClass {

	@Test
	public void buttonvalidation() throws InterruptedException {
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		HomePage hp = new HomePage(driver);

		Thread.sleep(2000);
		hp.clicktoggle();
		Thread.sleep(2000);
		hp.button();

		ButtonPage btnpg = new ButtonPage(driver);

		btnpg.btnone();
		Thread.sleep(2000);

		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		Assert.assertEquals(myalert.getText(), "You clicked the first button!");
		Thread.sleep(2000);
		myalert.accept();

		Thread.sleep(2000);

		btnpg.btntwo();
		Thread.sleep(2000);
		Alert myalert2 = mywait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		System.out.println(myalert2.getText());
		myalert2.accept();


	}

}
