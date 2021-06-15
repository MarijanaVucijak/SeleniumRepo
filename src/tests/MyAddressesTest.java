package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javafx.scene.control.Alert;

public class MyAddressesTest extends BaseTest {
	
@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}
		
    @Test (priority=0)
    
    public void updateAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("MyAddressUpdate", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("MyAddressUpdate", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myAddressesButtonClick();
		myAddressPage.updateButtonClick();
    	YourAddresses.getAddressInputField().clear();
		String addressInputField=citacIzExcela.getStringData("MyAddressUpdate", 12, 2);
		YourAddresses.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyAddressUpdate", 15, 2);
		String actualText = myAddressPage.textFromUpdateButton();
		assertEquals(actualText, textForAssertion);
	
    }
    
    @Test (priority=5)
    public void addAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddAddress", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddAddress", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myAddressesButtonClick();
		myAddressPage.addANewAddressButtonClick();
		String address=citacIzExcela.getStringData("AddAddress", 11, 2);
		myAccountPage.insertAddress(address);
		String city=citacIzExcela.getStringData("AddAddress", 12, 2);
		myAccountPage.insertCity(city);
		myAccountPage.getStateDropDownMenu();
		String stateDropDownMenu=citacIzExcela.getStringData("AddAddress", 13, 2);
		myAccountPage.insertState(stateDropDownMenu);
		String zipPostalCode=citacIzExcela.getStringData("AddAddress", 14, 2);
		myAccountPage.insertZipPostalCode(zipPostalCode);
		String mobilePhoneNumber=citacIzExcela.getStringData("AddAddress", 15, 2);
		myAccountPage.insertMobilePhoneNumber(mobilePhoneNumber);
		myAccountPage.getAddressTitle().clear();
		String addressTitle=citacIzExcela.getStringData("AddAddress", 17, 2);
		myAccountPage.insertAddressTitle();
		YourAddresses.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("AddAddress", 21, 1);
		String actualText = myAddressPage.textFromUpdateButton();
		assertEquals(actualText, textForAssertion);
    } 

    
    @Test (priority=10)
    public void removeAddress () throws InterruptedException {
    	mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("RemoveAddress", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("RemoveAdddress", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myAddressesButtonClick();
		myAddressPage.deleteButtonClick();
		Alert alert = (Alert) driver.switchTo().alert();
		((org.openqa.selenium.Alert) alert).accept();
		String textForAssertion=citacIzExcela.getStringData("RemoveAddress", 13, 1);
		String actualText = myAddressPage.textFromDeleteButton();
		assertEquals(actualText, textForAssertion);
    }

		@AfterMethod
		public void afterEveryTest() throws InterruptedException {
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}

}
