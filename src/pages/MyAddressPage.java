package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressPage {
	
	WebDriver driver;
	WebElement updateButton;
	WebElement message;
	
	
	public MyAddressPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
	}
	
	 public WebElement getMessage() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p[1]/strong"));
	}
	public void updateButtonClick() {
		 this.getUpdateButton().click();
	 }
	

}
