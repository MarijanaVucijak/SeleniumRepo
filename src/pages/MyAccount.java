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
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a"));
	}
	
	public WebElement getMyPersonalInformation() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a"));
	}
	
	public WebElement getMyWishList() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}
	public void myAddressesButtonClick() {
		this.getMyAddressesButton().click();
	}
	public void myPersonalInformationClick() {
		this.getMyPersonalInformation().click();
	}
	public void myWishList() {
		this.getMyWishList().click();
	}
}
