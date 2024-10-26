package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.IFramePage;
import testBase.BaseClass;

public class TC007_IFrameTest extends BaseClass{
	
	@Test
	public void iframevalidation() {
		
		HomePage hp = new HomePage(driver);
		hp.clicktoggle();
		hp.iframe();
		
		IFramePage iframe=new IFramePage(driver);
		iframe.frame1();
		driver.switchTo().defaultContent();
		iframe.frame2();
		
		
		
		
	}

}
