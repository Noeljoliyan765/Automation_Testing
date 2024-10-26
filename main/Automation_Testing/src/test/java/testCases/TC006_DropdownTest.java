package testCases;

import org.testng.annotations.Test;

import pageObjects.DropdownPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC006_DropdownTest extends BaseClass {

	@Test
	public void dropdownvalidation() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.clicktoggle();
		hp.dropdown();
		Thread.sleep(2000);

		DropdownPage dp = new DropdownPage(driver);
		Thread.sleep(2000);

		dp.drpdown();
		Thread.sleep(2000);
		dp.checkbox();

	}

	@Test
	public void checkboxvalidation() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clicktoggle();
		hp.dropdown();
		Thread.sleep(2000);

		DropdownPage dp = new DropdownPage(driver);
		dp.checkbox();

	}
	
	@Test
	public void navvalidation() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clicktoggle();
		hp.dropdown();
		Thread.sleep(2000);

		DropdownPage dp = new DropdownPage(driver);
		dp.nav();

	}

	
	
}
