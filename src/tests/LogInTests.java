package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LogInTests extends BaseTest {
	
	
	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	

@Test(priority=0)
	public void logInWithValidCredentials() throws InterruptedException{
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("LogInTest", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("LogInTest", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		String textForAssertion=citacIzExcela.getStringData("LogInTest", 10, 2);
		String actualText = signIn.textFromSignOutButton();
		assertEquals(actualText, textForAssertion);
	}


@Test(priority=5)
	public void logInWrongCredentials() throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddressInput = citacIzExcela.getStringData("LogInTest", 6, 3);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("LogInTest", 7, 3));
		String textForAssertion = citacIzExcela.getStringData("LogInTest", 10, 3);
		signIn.signInFormFilling(emailAddressInput, passwordInput);
		String actualText = signIn.textWrongEmailAddressLabel();
		assertEquals(actualText, textForAssertion);
	}

@Test(priority=10)	
	
	public void logInEmptyCredentials() throws InterruptedException {

		mainNavigation.SignInTabClick();
		String textForAssertion = citacIzExcela.getStringData("LogInTest", 10, 4);
		signIn.signInFormFilling("", "");
		String actualText = signIn.textWrongEmailAddressLabel();
		assertEquals(actualText, textForAssertion);
	
	}

@Test(priority=15)
	public void logOut() throws InterruptedException {

		String textForAssertion = citacIzExcela.getStringData("LogInTest", 8, 2);
		logInWithValidCredentials();
		signIn.signOutButtonClick();
		String actualText = signIn.textFromLogInButton();
		assertEquals(actualText, textForAssertion);
	}
	


	@AfterMethod
	public void nakonSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
