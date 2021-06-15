package tests;


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
	public void sigUpToMyAccount(int SelectDateOfBirth) throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("MyAccountTest", 6, 2);
		System.out.println(emailAddress);
		createAccountPage.insertEmailAddress(emailAddress);
		createAccountPage.createAnAccountButtonClick();
		myAccountPage.getTitle();
		String firstName=citacIzExcela.getStringData("MyAccountTest", 9, 2);
		myAccountPage.insertFirstName(firstName);
		String lastName=citacIzExcela.getStringData("MyAccountTest", 10, 2);
		myAccountPage.insertLastName(lastName);
		String password=String.valueOf(citacIzExcela.getIntegerData("MyAccountTest", 11, 2));
		myAccountPage.insertPassword(password);
		myAccountPage.selectDateOfBirth(SelectDateOfBirth);
		String dateOfBirthDropDownMenuClick=citacIzExcela.getStringData("MyAccountTest", 12, 2);
		myAccountPage.SelectDateOfBirth();
		myAccountPage.getMonthOfBirthDropDownMenu(dateOfBirthDropDownMenuClick);
		String monthOfBirthDropDownMenu=citacIzExcela.getStringData("MyAccountTest", 13, 2);
		myAccountPage.selectMonthOfBirth(monthOfBirthDropDownMenu);
		myAccountPage.getYearOfBirthDropDownMenu(0);
		String dateOfYearDropDownMenu=citacIzExcela.getStringData("MyAccountTest", 14, 2);
		myAccountPage.selectYearOfBirth(dateOfYearDropDownMenu);
		String firstNameYourAddress=citacIzExcela.getStringData("MyAccountTest", 15, 2);
		myAccountPage.insertFirstNameYourAddress(firstNameYourAddress);
		String lastNameYourAddress=citacIzExcela.getStringData("MyAccountTest", 16, 2);
		myAccountPage.insertLastNameYourAddress(lastNameYourAddress);
		String address=citacIzExcela.getStringData("MyAccountTest", 17, 2);
		myAccountPage.insertAddress(address);
		String city=citacIzExcela.getStringData("MyAccountTest", 18, 2);
		myAccountPage.insertCity(city);
		myAccountPage.getStateDropDownMenu();
		String stateDropDownMenu=citacIzExcela.getStringData("MyAccountTest", 19, 2);
		myAccountPage.insertState(stateDropDownMenu);
		String zipPostalCode=citacIzExcela.getStringData("MyAccountTest", 20, 2);
		myAccountPage.insertZipPostalCode(zipPostalCode);
		String mobilePhoneNumber=citacIzExcela.getStringData("MyAccountTest", 21, 2);
		myAccountPage.insertMobilePhoneNumber(mobilePhoneNumber);
		myAccountPage.registerButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyAccountTest", 24, 2);
		String actualText = myAccountPage.textFromRegisterButton(); 
		AssertJUnit.assertEquals(actualText, textForAssertion);
}
	
	@AfterMethod
	public void nakonSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}


