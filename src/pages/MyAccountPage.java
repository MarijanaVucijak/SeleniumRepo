package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
	

		WebDriver driver;
		WebElement title;
		WebElement firstName;
		WebElement lastName;
		WebElement password;
		WebElement dateOfBirth;
		Select SelectDateOfBirth;
		WebElement monthOfBirth;
		Select SelectMonthOfBirth;
		WebElement yearOfBirth;
		Select SelectYearOfBirth;
		WebElement firstNameYourAddress;
		WebElement lastNameYourAddress;
		WebElement address;
		WebElement city;
		Select SelectState;
		WebElement stateDropDownMenu;
		WebElement zipPostalCode;
		WebElement homePhoneNumber;
		WebElement AddressTitle;
		WebElement RegisterButton;
		WebElement AssignAnAddressAliasForFutureReference;
		
		public MyAccountPage(WebDriver driver) {
			super();
			this.driver = driver;
		}

		public WebElement getTitle() {
			return driver.findElement(By.id("id_gender2"));
		}

		public WebElement getFirstName() {
			return driver.findElement(By.id("customer_firstname"));
		}
		public WebElement getLastName() {
			return driver.findElement(By.id("customer_lastname"));
		}
		public WebElement getPassword() {
			return driver.findElement(By.id("passwd"));
		}
		public WebElement getDateOFBirth() {
			return driver.findElement(By.id("days"));
		}
		public WebElement getMonthOfBirth() {
			return driver.findElement(By.id("months"));
		}
		public WebElement getYearOfBirth() {
			return driver.findElement(By.id("years"));
		}
		public WebElement getFirstNameYourAddress() {
			return driver.findElement(By.id("firstname"));
		}
		public WebElement getLastNameYourAddress() {
			return driver.findElement(By.id("lastname"));
		}
		public WebElement getAddress() {
			return driver.findElement(By.id("address1"));
		}
		public WebElement getCity() {
			return driver.findElement(By.id("city"));
		}
		public Select getState() {
			SelectState= new Select (driver.findElement(By.id("id_state")));
			return SelectState;
		}
		public WebElement getStateDropDownMenu() {
			return driver.findElement(By.id("id_state"));
		}
		public WebElement getZipPostalCode() {
			return driver.findElement(By.id("postcode"));
		}
		public WebElement getHomePhoneNumber() {
			return driver.findElement(By.id("phone"));
		}
		public WebElement getRegisterButton() {
			return driver.findElement(By.id("submitAccount"));
		}
		public WebElement getMessage() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		}
		public WebElement getAssignAnAddressAliasForFutureReference() {
			return driver.findElement(By.id("alias"));
		}

		
		
		
		public void titleClick(String title) {
			this.getTitle().click();
		}
		public void insertFirstName(String firstName) {
			this.getFirstName().sendKeys(firstName);
		}
		public void insertLastName(String lastName) {
			this.getLastName().sendKeys(lastName);
		}
		public void insertPassword(String password) {
			this.getPassword().sendKeys(password);
		}
		public void DateOfBirthClick() {
		this.getDateOFBirth().click();
		}
		public void insertDateOfBirth(String dateOfBirth) {
			this.getDateOFBirth().sendKeys(dateOfBirth);
		}
		public void MonthOfBirth(String month) {
			this.getMonthOfBirth().click();
		}
		public void insertMonthOfBirth(String monthOfBirth) {
			this.getMonthOfBirth().sendKeys(monthOfBirth);
		}
		public void selectYearOfBirth(String year) {
			this.getYearOfBirth().click();
		}
		public void insertYearOfBirth(String yearOfBirth) {
			this.getYearOfBirth().sendKeys(yearOfBirth);
		}
		public void insertFirstNameYourAddress(String firstNameYourAddress) {
			this.getFirstNameYourAddress().sendKeys(firstNameYourAddress);
		}
		public void insertLastNameYourAddress(String lastNameYourAddress) {
			this.getLastNameYourAddress().sendKeys(lastNameYourAddress);
		}
		public void insertAddress(String Address) {
			this.getAddress().sendKeys(Address);
		}
		public void insertCity(String City) {
			this.getCity().sendKeys(City);
		}
		public void StateDropDownMenuClick(String State) {
			this.getStateDropDownMenu().click();
		}
		public void insertState(String State) {
			this.getStateDropDownMenu().sendKeys(State);
		}
		public void insertZipPostalCode(String zipPostalCode) {
			this.getZipPostalCode().sendKeys(zipPostalCode);
		}
		public void insertHomePhoneNumber(String HomePhoneNumber) {
			this.getHomePhoneNumber().sendKeys(HomePhoneNumber);
		}
		public void registerButtonClick() {
			this.getRegisterButton().click();
		}
		public String textMessage() {
			return this.getMessage().getText();
		}
		public void insertAssignAnAddressAliasForFutureReference(String AssignAnAddressAliasForFutureReference) {
			this.getAssignAnAddressAliasForFutureReference().sendKeys(AssignAnAddressAliasForFutureReference);
		}

}




