package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YourPersonalInformation {
	
	WebDriver driver;
	WebElement socialTitle;
	WebElement firstName;
	WebElement lastName;
	WebElement emailAddress;
	WebElement date;
	Select SelectDateOfBirth;
	WebElement month;
	Select SelectMonthOfBirth;
	WebElement year;
	Select SelectYearOfBirth;
	WebElement CurrentPassword;
	WebElement newPassword;
	WebElement confirmation;
	WebElement siguUpForNewsletter;
	WebElement ReceiveSpecialOffersFromOurPartners;
	WebElement saveButton;
	WebElement textFromSaveButton;
	
	public YourPersonalInformation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getSocialTitle() {
		return driver.findElement(By.id("id_gender2"));
	}
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}
	public WebElement getLastName() {
		return driver.findElement(By.id("lastname"));
	}
	public WebElement getEmailAddress() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getDate() {
		return driver.findElement(By.id("days"));
	}
	public WebElement getMonth() {
		return driver.findElement(By.id("uniform-months"));
	}
	public WebElement getYear() {
		return driver.findElement(By.id("uniform-years"));
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
	public WebElement getSiguUpForNewsletter() {
		return driver.findElement(By.id("newsletter"));
	}
	public WebElement getReceiveSpecialOffersFromOurPartners() {
		return driver.findElement(By.id("optin"));
	}
	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	}
	public WebElement getTextFromSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
	}
	
	public void socialTitleClick() {
		this.getSocialTitle().click();
	}
	public void insertfirstName(String firstName) {
		this.getFirstName().sendKeys(firstName);
	}
	public void insertlastName(String lastName) {
		this.getLastName().sendKeys(lastName);
	}
	public void inserteMail (String email) {
		this.getEmailAddress().sendKeys(email);
	}
	public void dateClick () {
		this.getDate().click();
	}
	public void monthClick () {
		this.getMonth().click();
	}
	public void yearClick () {
		this.getYear().click();
	}
	public void insertCurrentPassword(String CurrentPassword) {
		this.getCurrentPassword().sendKeys(CurrentPassword);
	}
	public void insertNewPassword(String newPassword) {
		this.getNewPassword().sendKeys(newPassword);
	}
	public void insertConfirmation(String confirmation) {
		this.getConfirmation().sendKeys(confirmation);
	}
	public void siguUpForNewsletterClick() {
		this.getSiguUpForNewsletter().click();
	}
	public void ReceiveSpecialOffersFromOurPartnersClick() {
		this.getReceiveSpecialOffersFromOurPartners().click();
	}
	public String textFromSaveButton() {
		return this.getTextFromSaveButton().getText();
	}
	public void saveButtonClick () {
		this.getSaveButton().click();
	}
}
