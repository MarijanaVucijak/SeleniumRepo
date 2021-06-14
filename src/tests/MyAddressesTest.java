package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddressesTest extends BaseTest {
	
@BeforeMethod
	
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
}
		
    @Test (priority=0)
    
    public void updateAddress () throws InterruptedException {
    	
    	
    }



		@AfterMethod
		public void afterEveryTest() throws InterruptedException {
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}

}
