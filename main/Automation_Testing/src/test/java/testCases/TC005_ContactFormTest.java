package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactFormPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC005_ContactFormTest extends BaseClass{
	
	@Test
	public void contactformvalidation() throws InterruptedException {
	
	HomePage hp=new HomePage(driver);
	hp.clicktoggle();
	hp.contactform();
	Thread.sleep(2000);
	
	ContactFormPage cf=new ContactFormPage(driver);
	cf.fname();
	cf.lname();
	cf.email();
	cf.comments();
	cf.submit();
	
	Assert.assertEquals(cf.mssg(),"Thank you for your mail!");
	
	}
	

}
