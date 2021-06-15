package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
	WebDriver driver;
	WebElement myAddressesButton;
	WebElement myPersonalInformation;
	WebElement myWishList;
	
	public MyAccount(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}
	
	public WebElement getMyPersonalInformation() {
		return driver.findElement(By.xpath("center_column"));
	}
	
	
	public WebElement getMyWishList() {
		return driver.findElement(By.id("center_column"));
	}
	public void myAddressesButtonClick() {
		this.getMyAddressesButton().click();
	}
	public void myPersonalInformationClick() {
		this.getMyPersonalInformation().click();
	}
	public void myWishListClick() {
		this.getMyWishList().click();
	}
}
