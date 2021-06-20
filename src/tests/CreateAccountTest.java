package tests;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
	

@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
}
	@Test
	public void sigUpToMyAccount() throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("MyAccountTest", 6, 2);
		createAccountPage.insertEmailAddress(emailAddress);
		createAccountPage.createAnAccountButtonClick();
		myAccountPage.getTitle();
		String firstName=citacIzExcela.getStringData("MyAccountTest", 9, 2);
		myAccountPage.insertFirstName(firstName);
		String lastName=citacIzExcela.getStringData("MyAccountTest", 10, 2);
		myAccountPage.insertLastName(lastName);
		String password=String.valueOf(citacIzExcela.getIntegerData("MyAccountTest", 11, 2));
		myAccountPage.insertPassword(password);
		myAccountPage.DateOfBirthClick();
		String dateOFBirth=String.valueOf(citacIzExcela.getIntegerData("MyAccountTest", 12, 2));
		myAccountPage.insertDateOfBirth(dateOFBirth);
		String monthOfBirth=citacIzExcela.getStringData("MyAccountTest", 13, 2);
		myAccountPage.insertMonthOfBirth(monthOfBirth);
		String yearOfBirth=String.valueOf(citacIzExcela.getIntegerData("MyAccountTest", 14, 2));
		myAccountPage.insertYearOfBirth(yearOfBirth);
		String firstNameYourAddress=citacIzExcela.getStringData("MyAccountTest", 15, 2);
		myAccountPage.getFirstNameYourAddress().clear();
		myAccountPage.insertFirstNameYourAddress(firstNameYourAddress);
		String lastNameYourAddress=citacIzExcela.getStringData("MyAccountTest", 16, 2);
		myAccountPage.getLastNameYourAddress().clear();
		myAccountPage.insertLastNameYourAddress(lastNameYourAddress);
		String address=citacIzExcela.getStringData("MyAccountTest", 17, 2);
		myAccountPage.insertAddress(address);
		String city=citacIzExcela.getStringData("MyAccountTest", 18, 2);
		myAccountPage.insertCity(city);
		/*myAccountPage.getStateDropDownMenu();
		String stateDropDownMenu=citacIzExcela.getStringData("MyAccountTest", 19, 2);
		myAccountPage.insertState(stateDropDownMenu);
		String zipPostalCode=String.valueOf(citacIzExcela.getIntegerData("MyAccountTest", 20, 2));
		myAccountPage.insertZipPostalCode(zipPostalCode);
		String homePhoneNumber=citacIzExcela.getStringData("MyAccountTest", 21, 2);
		myAccountPage.insertHomePhoneNumber(homePhoneNumber);
		String AssignAnAddressAliasForFutureReference=citacIzExcela.getStringData("MyAccountTest", 22, 2);
		myAccountPage.getAssignAnAddressAliasForFutureReference().clear();
		myAccountPage.insertAssignAnAddressAliasForFutureReference(AssignAnAddressAliasForFutureReference);
		myAccountPage.registerButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyAccountTest", 25, 2);
		String actualText = myAccountPage.textMessage(); 
		AssertJUnit.assertEquals(actualText, textForAssertion);*/
	}
	
	@AfterMethod
	public void nakonSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}


