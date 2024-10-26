package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import pageObjects.BrowserTabPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC004_BrowserTabTest extends BaseClass{
	
	@Test
	public void browsertabstest() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.clicktoggle();
		hp.browsertabs();
		
		BrowserTabPage btp=new BrowserTabPage(driver);
		btp.opentab();
		
		Set<String> windowids=driver.getWindowHandles();
		
		List<String> wid=new ArrayList(windowids);
		System.out.println(wid.get(0));
		System.out.println(wid.get(1));
		Thread.sleep(2000);

		driver.switchTo().window(wid.get(1));
		Thread.sleep(2000);

		
	}

}
