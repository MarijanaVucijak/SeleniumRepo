package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddresses {
	
	WebDriver driver;
	WebElement addressInputField;
	WebElement saveButton;
	
	
	public YourAddresses(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getAddressInputField() {
		return driver.findElement(By.xpath("address1"));
		}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("submitAddress"));
		
	}
	public void insertAddressInputField() {
		this.getAddressInputField().sendKeys();
	}
	public void saveButtonClick () {
		this.getSaveButton().click();
	}

}
