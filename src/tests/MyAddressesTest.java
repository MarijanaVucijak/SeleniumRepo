package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MyAddressesTest extends BaseTest {
	
@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}

   @Test (priority=5)
    public void updateAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("MyAddressUpdate", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("MyAddressUpdate", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
    	myAccount.myAddressesButtonClick();
		myAddressPage.updateButtonClick();
		String firstNameInputField=citacIzExcela.getStringData("MyAddressUpdate", 11, 2);
		String lastNameInputField=citacIzExcela.getStringData("MyAddressUpdate", 12, 2);
		String addressInputField=citacIzExcela.getStringData("MyAddressUpdate", 13, 2);
		String cityInputField=citacIzExcela.getStringData("MyAddressUpdate", 14, 2);
		YourAddresses.getFirstName().clear();
		YourAddresses.getLastName().clear();
		YourAddresses.insertFirstName(firstNameInputField);
		YourAddresses.insertLastName(lastNameInputField);
		YourAddresses.insertAddressInputField(addressInputField);
		YourAddresses.insertCity(cityInputField);
		YourAddresses.StateClick();
		String zipPostalCodeInput = String.valueOf(citacIzExcela.getIntegerData("MyAddressUpdate", 16, 2));
		YourAddresses.countryClick();
		String MobilePhoneInputField=String.valueOf(citacIzExcela.getIntegerData("MyAddressUpdate", 18, 2));
		String pleseAssignAnAddressTitleField=citacIzExcela.getStringData("MyAddressUpdate", 19, 2);
		YourAddresses.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyAddressUpdate", 22, 1);
		String actualText = myAddressPage.textFromUpdateButton();
		assertEquals(actualText, textForAssertion);
	
    }

   @Test (priority=0)
    public void addAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddAddress", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddAddress", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAddressPage.addANewAddressButtonClick();
		String firstName=citacIzExcela.getStringData("AddAddress", 11, 2);
		String lastName=citacIzExcela.getStringData("AddAddress", 12, 2);
		String address=citacIzExcela.getStringData("AddAddress", 13, 2);
		String city=citacIzExcela.getStringData("AddAddress", 14, 2);
		YourAddresses.getFirstName().clear();
		YourAddresses.getLastName().clear();
		YourAddresses.insertFirstName(firstName);
		YourAddresses.insertLastName(lastName);
		YourAddresses.insertAddressInputField(address);
		YourAddresses.insertCity(city);
		YourAddresses.StateClick();
		String stateDropDownMenu=citacIzExcela.getStringData("AddAddress", 15, 2);
		String zipPostalCode=String.valueOf(citacIzExcela.getIntegerData("AddAddress", 16, 2));
		YourAddresses.insertZipPostalCode(zipPostalCode);
		YourAddresses.countryClick();
   		String mobilePhoneNumber=citacIzExcela.getStringData("AddAddress", 17, 2);
		YourAddresses.insertMobilePhone(mobilePhoneNumber);
   		
   		String addressTitle=citacIzExcela.getStringData("AddAddress", 19, 2);
   		YourAddresses.getPleseAssignAnAddressTitle().clear();
   		YourAddresses.insertPleseAssignAnAddressTitle(addressTitle);
   		
   		YourAddresses.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("AddAddress", 23, 1);
		String actualText = myAddressPage.textFromUpdateButton();
		assertEquals(actualText, textForAssertion);
  } 
   @Test (priority=10)
    public void removeAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("RemoveAddress", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("RemoveAddress", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myAddressesButtonClick();
		myAddressPage.deleteButtonClick();
		Alert alert =  driver.switchTo().alert();
		alert.accept();
	
		
		String textForAssertion=citacIzExcela.getStringData("RemoveAddress", 13, 1);
		String actualText = myAddressPage.textAfterDelete();
		System.out.println("Actual text: "+ actualText);
		System.out.println("Text For assertion: "+ textForAssertion);
		assertEquals(actualText, textForAssertion);
    
    }
		@AfterMethod
		public void afterEveryTest() throws InterruptedException {
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}

}
