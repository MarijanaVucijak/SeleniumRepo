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
		WebElement dateOfBirthDropDownMenu;
		Select SelectDateOfBirth;
		WebElement monthOfBirthDropDownMenu;
		Select SelectMonthOfBirth;
		WebElement yearOfBirthDropDownMenu;
		Select SelectYearOfBirth;
		WebElement firstNameYourAddress;
		WebElement lastNameYourAddress;
		WebElement address;
		WebElement city;
		Select SelectState;
		WebElement stateDropDownMenu;
		WebElement zipPostalCode;
		WebElement mobilePhoneNumber;
		WebElement AddressTitle;
		WebElement RegisterButton;
		
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
		
		public Select SelectDateOfBirth() {
			SelectDateOfBirth= new Select (driver.findElement(By.id("days")));
			return SelectDateOfBirth;
		}
		public Select getSelectMonthOfBirth() {
			SelectMonthOfBirth= new Select (driver.findElement(By.id("months")));
			return SelectMonthOfBirth;
		}
		public Select getSelectYearOfBirth() {
			SelectYearOfBirth= new Select (driver.findElement(By.id("years")));
			return SelectYearOfBirth;
		}
		

		public WebElement getDateOfBirthDropDownMenu(int SelectDateOfBirth ) {
			return driver.findElement(By.id("days"));
		}

		public WebElement getMonthOfBirthDropDownMenu(String SelectMonthOfBirth) {
			return driver.findElement(By.id("months"));
		}

		public WebElement getYearOfBirthDropDownMenu(int SelectYearOfBirth) {
			return driver.findElement(By.id("years"));
		}

		public WebElement getFirstNameYourAddress() {
			return driver.findElement(By.id("firstname"));
		}

		public WebElement getLastNameYourAddress() {
			return driver.findElement(By.id("lastname"));
		}

		public WebElement getAddress() {
			return driver.findElement(By.id("address2"));
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


		public WebElement getMobilePhoneNumber() {
			return driver.findElement(By.id("phone_mobile"));
		}
		
		

		public WebElement getAddressTitle() {
			return driver.findElement(By.xpath("alias"));
		}

		public WebElement getRegisterButton() {
			return driver.findElement(By.id("submitAccount"));
		}
		public WebElement getMessage() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
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
		public void selectDateOfBirth(int day) {
			this.SelectDateOfBirth().selectByIndex(day);
		}
		public void selectMonthOfBirth(String month) {
			this.getSelectMonthOfBirth().selectByVisibleText(month);
		}
		public void selectYearOfBirth(String year) {
			this.getSelectYearOfBirth().selectByVisibleText(year);
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
			this.getStateDropDownMenu().sendKeys();
		}
		

		public void insertZipPostalCode(String zipPostalCode) {
			this.getZipPostalCode().sendKeys(zipPostalCode);
	}
	
		public void insertMobilePhoneNumber(String MobilePhoneNumber) {
			this.getMobilePhoneNumber().sendKeys(MobilePhoneNumber);
	}
		
		public void insertAddressTitle() {
			this.getAddressTitle().sendKeys();
		}
		public void registerButtonClick() {
			this.getRegisterButton().click();
		}
		public String textFromRegisterButton() {
			
			return this.getRegisterButton().getText();
	}

}




