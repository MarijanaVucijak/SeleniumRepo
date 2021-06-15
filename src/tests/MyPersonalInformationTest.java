package tests;

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
		signIn.signInButtonClick(signIn);
		myAccount.myPersonalInformationClick();
		String currentPasswordInput = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 10, 2));
		String newPasswordInput = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 11, 2));
		String confirmation = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInformation", 12, 2));
		yourPersonalInformation.saveButtonClick();
		String textForAssertion=citacIzExcela.getStringData("MyPersonalInformation", 15, 1);
		String actualText = yourPersonalInformation.textFromSaveButton();
		assertEquals(actualText, textForAssertion);
    }
	
	
	@AfterMethod
public void nakonSvakogTesta() throws InterruptedException {
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
}
		
}
