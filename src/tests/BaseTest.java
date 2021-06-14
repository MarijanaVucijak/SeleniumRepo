package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.MainNavigation;
import pages.SignIn;

public class BaseTest {
	
	WebDriver driver;
	MainNavigation mainNavigation;
	SignIn signIn;
	ExcelReader citacIzExcela;
	String homeUrl;

	@BeforeClass
	
	public void beforeAllTests() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		mainNavigation=new MainNavigation(driver);
		signIn= new SignIn(driver);
		citacIzExcela =  new ExcelReader("data\\AutomationPlan.xlsx");
		homeUrl = "http://automationpractice.com/index.php";
	}
	
	@AfterClass
	
	public void aferAllTests() {
		driver.close();
	}
}
