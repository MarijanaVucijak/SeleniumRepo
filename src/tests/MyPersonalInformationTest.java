package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInformationTest extends BaseTest{

	
	@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}
		
	@Test
	public void editPersonalInformation () throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("MyPersonalInformation", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myPersonalInformationClick();
		yourPersonalInformation.socialTitleClick();
		String firstName=citacIzExcela.getStringData("MyPersonalInformation", 11, 2);
		String lastName=citacIzExcela.getStringData("MyPersonalInformation", 12, 2);
	 	String emailAddress1=citacIzExcela.getStringData("MyPersonalInformation", 13, 2);
	 	yourPersonalInformation.getFirstName().clear();
	 	yourPersonalInformation.insertfirstName(firstName);
	 	yourPersonalInformation.getLastName().clear();
	 	yourPersonalInformation.insertlastName(lastName);
	 	yourPersonalInformation.getEmailAddress().clear();
	 	yourPersonalInformation.inserteMail(emailAddress);
	 	yourPersonalInformation.dateClick();
	 	String date=String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 14, 2));
	 	yourPersonalInformation.getDate();
	 	yourPersonalInformation.monthClick();
	 	String month=citacIzExcela.getStringData("MyPersonalInformation", 15, 2);
	 	yourPersonalInformation.getMonth();
	 	yourPersonalInformation.yearClick();
	 	String year=String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 16, 2));
	 	yourPersonalInformation.getYear();
		String currentPasswordInput = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 17, 2));
		yourPersonalInformation.insertCurrentPassword(currentPasswordInput);
		String newPasswordInput = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 18, 2));
		yourPersonalInformation.insertNewPassword(newPasswordInput);
		String confirmation = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 19, 2));
		yourPersonalInformation.insertConfirmation(confirmation);
		yourPersonalInformation.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyPersonalInformation", 25, 1);
		String actualText = yourPersonalInformation.textFromSaveButton();
		assertEquals(actualText, textForAssertion);
    }
	
	
	@AfterMethod
public void nakonSvakogTesta() throws InterruptedException {
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
}
		
}
