package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	WebDriver driver;
	WebElement emailAddressInput;
	WebElement passwordInput;
	WebElement signInButton;
	WebElement signOutButton;
	WebElement signInFormFilling;
	WebElement wrongEmailAddressLabel;
	
	 public SignIn(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getEmailAddressInput() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getPasswordInput() {
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}
	public WebElement getSignInButton() {
		return driver.findElement(By.id("header"));
	}
	
	public WebElement getSignOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	
	public WebElement getErrorMessage() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}
	 
 
	public void insertEmailAddressInput(String emailAddressInput) {
		this.getEmailAddressInput().sendKeys(emailAddressInput);
	}
	public void insertPasswordInput(String passwordInput) {
		this.getPasswordInput().sendKeys(passwordInput);
	}
	
	public void signInButtonClick(SignIn signIn) {
		this.getSignInButton().click();
	}
	public String textFromSignInButton() {
		return this.getSignInButton().getText();
		
}
	public void signOutButtonClick() {
		this.getSignOutButton().click();
	}
	public String textFromSignOutButton() {
		return this.getSignOutButton().getText();
}
	public void signInFormFilling(String email, String password) throws InterruptedException {
		insertEmailAddressInput(email);
		insertPasswordInput(password);
		this.getSignInButton().click();
}
	public String textFromLogInButton() {
		
		return this.getSignInButton().getText();
	
	}
	public String textWrongEmailAddressLabel() {

		 System.out.println("poruka "+getErrorMessage().getText());
		return getErrorMessage().getText()  ;
	}
	
}