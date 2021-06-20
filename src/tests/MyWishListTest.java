package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.Alert;		
import pages.myWishListpage;

public class MyWishListTest extends BaseTest {
	
	
	@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}	


	@Test (priority=0)
	
	public void addWishList () throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddWishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddWishList", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myWishList();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.insertName(name);
		myWishListPage.saveClick();
		myWishListPage.blouseClick();
		myWishListPage.addToWishListClick();
		String textForAssertion=citacIzExcela.getStringData("AddWishList", 15, 1);
		String actualText = myWishListPage.textFromPopUpButton();
				
		assertEquals(actualText, textForAssertion);
		myWishListPage.popUpCloseClick();
		
		}
	
	@Test (priority=10)
	public void addMultipleWishList() throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddMultiplewishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddMultipleWishList", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myWishList();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.insertName(name);
		myWishListPage.saveClick();
		String name1 = citacIzExcela.getStringData("AddWishList", 12, 2);
		myWishListPage.insertName1(name1);
		myWishListPage.saveClick();
	}

	@Test (priority=5)
	public void deleteWishList () throws InterruptedException {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddMultipleWishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddMultipleWishList", 7, 2));
		signIn.signInFormFilling(emailAddress, passwordInput);
		signIn.signInButtonClick(signIn);
		myAccount.myWishList();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.insertName(name);
		myWishListPage.saveClick();
		myWishListPage.deleteWishListClick();
		Alert alert =driver.switchTo().alert();
		alert.accept();
	}
	@AfterMethod
public void nakonSvakogTesta() throws InterruptedException {
driver.manage().deleteAllCookies();
driver.navigate().refresh();
}
}
