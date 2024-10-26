package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage {

	public ButtonPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@id='btn_one']")
	WebElement btnone;
	@FindBy(xpath = "//button[@id='btn_two']")
	WebElement btntwo;
	@FindBy(xpath = "//button[@id='btn_three']")
	WebElement btnthree;

	public void btnone() {
		btnone.click();

	}

	public void btntwo() {
		btntwo.click();
	}

	public void btnthree() {
		btnthree.click();
	}

}
