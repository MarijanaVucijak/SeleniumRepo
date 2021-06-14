package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {

	
		
		WebDriver driver;
		WebElement emailAddress;
		WebElement craeteAnAccountButton;
		
		public CreateAccountPage(WebDriver driver) {
			super();
			this.driver = driver;
		}

		public WebElement getEmailAddress() {
			return driver.findElement(By.id("email_create"));
		}

		public WebElement getCreateAnAccountButton() {
			return driver.findElement(By.id("SubmitCreate"));
		}
		
		public void insertEmailAddress(String emailAddressInput) {
			this.getEmailAddress().sendKeys(emailAddressInput);
		}
		public void createAnAccountButtonClick() {
			this.getCreateAnAccountButton().click();
		}
		
	}

