package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
	
	WebDriver driver;
	WebElement SignInTab;
	WebElement myAccountPageTab;
	WebElement createAccountPageTab;
	WebElement myAccountTab;
	WebElement MyAddressPage;
	WebElement YourAddresses;
	
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInTab() {
		return driver.findElement(By.id("header"));
	}
	public void SignInTabClick() {
		this.getSignInTab().click();
	}
	public WebElement getMyAccountPageTab () {
	return driver.findElement(By.id("create-account_form"));
	}
	
	public WebElement getCreateAccountPageTab () {
		return driver.findElement(By.id("noSlide"));
	
	}

	public WebElement getMyAccountTab() {
		return driver.findElement(By.id("center_column"));
	}

	public WebElement getMyAddressPage() {
		return driver.findElement(By.id("columns"));
	}

	public WebElement getYourAddresses() {
		return driver.findElement(By.id("columns"));

	
	
}
}	

