package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressPage {
	
	WebDriver driver;
	WebElement updateButton;
	WebElement message;
	WebElement addANewAddressButton; 
	WebElement deleteButton;
	WebElement okButton;
	
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
	 
	 
	public WebElement getAddANewAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a"));
		
		
	}
	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]"));
	}
	public WebElement getTextAfterDelete() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]"));
	}
	
	public WebElement getOkButton() {
		return driver.findElement(By.id(""));
	}
	public void updateButtonClick() {
		 this.getUpdateButton().click();
	 }
	public String textFromUpdateButton() {
		return this.getUpdateButton().getText();

}
	public void addANewAddressButtonClick () {
		this.getAddANewAddressButton().click();
	}
	public void deleteButtonClick () {
		this.getDeleteButton().click();
	}
	public String textFromDeleteButton() {
		return this.getDeleteButton().getText();
}
	public String textAfterDelete() {
		return this.getTextAfterDelete().getText();
	}
	
	
}