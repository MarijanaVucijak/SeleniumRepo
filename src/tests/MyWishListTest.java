package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javafx.scene.control.Alert;
import pages.myWishListpage;

public class MyWishListTest extends BaseTest {
	
	
	@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}	


	@Test (priority=0)
	
	public void addWishList () {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddWishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddWishList", 7, 2));
		signIn.signInButtonClick(signIn);
		myAccount.myWishListClick();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.saveClick();
		myWishListPage.blouseClick();
		myWishListPage.addToWishListClick();
		String textForAssertion=citacIzExcela.getStringData("AddWishList", 15, 2);
		String actualText = myWishListPage.textFromPopUpButton();
		assertEquals(actualText, textForAssertion);
		myWishListPage.popUpCloseClick();
		
		}
	
	@Test (priority=5)
	public void addMultipleWishList() {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddMultiplewishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddMultipleWishList", 7, 2));
		signIn.signInButtonClick(signIn);
		myAccount.myWishListClick();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.saveClick();
		String name1 = citacIzExcela.getStringData("AddWishList", 13, 2);
		myWishListPage.saveClick();
	}
	
	@Test (priority=10)
	public void deleteWishList () {
		mainNavigation.SignInTabClick();
		String emailAddress = citacIzExcela.getStringData("AddMultiplewishList", 6, 2);
		String passwordInput = String.valueOf(citacIzExcela.getIntegerData("AddMultipleWishList", 7, 2));
		signIn.signInButtonClick(signIn);
		myAccount.myWishListClick();
		String name = citacIzExcela.getStringData("AddWishList", 10, 2);
		myWishListPage.saveClick();
		Alert alert = (Alert) driver.switchTo().alert();
		((org.openqa.selenium.Alert) alert).accept();
	}
	
	@AfterMethod
public void nakonSvakogTesta() throws InterruptedException {
driver.manage().deleteAllCookies();
driver.navigate().refresh();
}
}
