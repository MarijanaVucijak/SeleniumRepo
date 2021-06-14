package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
	WebDriver driver;
	WebElement myAddressesButton;
	
	public MyAccount(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}
	
	public void myAddressesButtonClick() {
		this.getMyAddressesButton().click();
	}

}
