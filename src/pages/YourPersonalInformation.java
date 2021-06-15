package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourPersonalInformation {
	
	WebDriver driver;
	WebElement CurrentPassword;
	WebElement newPassword;
	WebElement confirmation;
	WebElement saveButton;
	WebElement textFromSaveButton;
	
	public YourPersonalInformation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getCurrentPassword() {
		return driver.findElement(By.id("old_passwd"));
	}
	public WebElement getNewPassword() {
		return driver.findElement(By.id("passwd"));
	}
	public WebElement getConfirmation() {
		return driver.findElement(By.id("confirmation"));
	}
	
	
	public WebElement getSaveButton() {
		return driver.findElement(By.id("center_column"));
	}
	public WebElement getTextFromSaveButton() {
		return driver.findElement(By.id("center_column"));
	}
	public void insertCurrentPassword(String CurrentPassword) {
		this.getCurrentPassword().sendKeys(CurrentPassword);
	}
	public void insertNewtPassword(String newPassword) {
		this.getNewPassword().sendKeys(newPassword);
		
	}
	public void insertConfirmation(String confirmation) {
		this.getConfirmation().sendKeys(confirmation);
		
	}
	public String textFromSaveButton() {
		return this.getTextFromSaveButton().getText();
		
}
	public void saveButtonClick () {
		this.getSaveButton().click();
	}
}
