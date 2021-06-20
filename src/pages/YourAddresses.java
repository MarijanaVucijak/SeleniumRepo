package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YourAddresses {
	
	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement addressInputField;
	WebElement city;
	WebElement state;
	Select stateDropDownMenu;
	WebElement zipPostalCode;
	WebElement country;
	Select countryDropDownMenu ;
	WebElement mobilePhone;
	WebElement pleseAssignAnAddressTitle;
	WebElement saveButton;
	
	
	public YourAddresses(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}
	public WebElement getLastName() {
		return driver.findElement(By.id("lastname"));
	}
	public WebElement getAddressInputField() {
		return driver.findElement(By.id("address1"));
		}
	public WebElement getCity() {
		return driver.findElement(By.id("city"));
	}
	public WebElement getState() {
		return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[34]"));
	}
	public WebElement getZipPostalCode() {
		return driver.findElement(By.id("postcode"));
	}
	public WebElement getCountry() {
		return driver.findElement(By.id("id_country"));
	}
	public WebElement getMobilePhone() {
		return driver.findElement(By.id("phone"));
	}
	public WebElement getPleseAssignAnAddressTitle() {
		return driver.findElement(By.id("alias"));
	}
	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}
	
	
	public void insertFirstName (String firstName) {
		this.getFirstName().sendKeys(firstName);
	}
	public void insertLastName (String lastName) {
		this.getLastName().sendKeys(lastName);
	}
	public void insertAddressInputField(String address) {
		this.getAddressInputField().sendKeys(address);
	}
	public void insertCity (String City) {
	    this.getCity().sendKeys(City);	
	}
	public void StateClick ( ) {
		this.getState().click();
	}
	public void insertZipPostalCode (String zipPostalCode) {
		this.getZipPostalCode().sendKeys(zipPostalCode);
	}
	public void countryClick( ) {
		this.getCountry().click();
	}
	public void insertMobilePhone(String mobilePhone ) {
		this.getMobilePhone().sendKeys(mobilePhone);
	}
	public void insertPleseAssignAnAddressTitle(String pleseAssignAnAddressTitle) {
		this.getPleseAssignAnAddressTitle().sendKeys(pleseAssignAnAddressTitle);
	}
	public void saveButtonClick () { 
		this.getSaveButton().click();
	}

}
