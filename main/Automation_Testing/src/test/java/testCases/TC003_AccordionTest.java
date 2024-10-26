package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccordionPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC003_AccordionTest extends BaseClass{
	
	@Test
	public void accordiontest() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.clicktoggle();
		hp.accordion();
		Thread.sleep(2000);
		
		AccordionPage acc=new AccordionPage(driver);
		acc.platform();
		String className=acc.platform.getAttribute("class");
		System.out.println(className);
		System.out.println(acc.text.getText());
		
		
		Assert.assertEquals(acc.text.getText(), "Testing is a repetitive process. The slightest modification in code must be tested to ensure that the software is providing the desired functionality and result. Repeating tests manually is a time consuming and costly process. Automated tests can be run repetitively at no additional costs. Selenium is a highly portable tool that runs on multiple platforms as well as browsers. It therefore allows automation engineers the ease of writing code without worrying about the platform on which it will run.");

		
		if(className.contains("accordion-header active")) {
			System.out.println("tesst passed");
		}
		else {
			System.out.println("tesst failed");
		}
		
		
		
		
		
		
	}
	

	
	
	
	
	

}
