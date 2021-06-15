package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CreateAccountPage;
import pages.MainNavigation;
import pages.MyAccount;
import pages.MyAccountPage;
import pages.MyAddressPage;
import pages.SignIn;
import pages.YourAddresses;
import pages.YourPersonalInformation;
import pages.myWishListpage;

public class BaseTest {
	
	WebDriver driver;
	MainNavigation mainNavigation;
	SignIn signIn;
	ExcelReader citacIzExcela;
	String homeUrl;
	YourAddresses YourAddresses;
	MyAccount myAccount;
	MyAddressPage myAddressPage;
	MyAccountPage myAccountPage;
	CreateAccountPage createAccountPage;
	YourPersonalInformation yourPersonalInformation;
	myWishListpage myWishListPage;
	@BeforeClass
	
	public void beforeAllTests() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		mainNavigation=new MainNavigation(driver);
		createAccountPage=new CreateAccountPage(driver);
		myAccountPage=new MyAccountPage(driver);
		signIn= new SignIn(driver);
		myAddressPage=new MyAddressPage(driver);
		myAccount=new MyAccount(driver);
		YourAddresses=new YourAddresses(driver);
		yourPersonalInformation=new YourPersonalInformation(driver);
		myWishListPage=new myWishListpage(driver);
		citacIzExcela =  new ExcelReader("data\\AutomationPlan.xlsx");
		homeUrl = "http://automationpractice.com/index.php";
	}
	
	@AfterClass
	
	public void aferAllTests() {
		driver.close();
	}
}
