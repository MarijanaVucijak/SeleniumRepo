package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myWishListpage {
	
	
	WebDriver driver;
	WebElement name;
	WebElement printedChiffonDress;
	WebElement Blouse;
	WebElement save;
	WebElement addToWishList;
	WebElement popUpClose;
	WebElement popUpButton;
	WebElement deleteWishList;
	
	public myWishListpage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getName() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getPrintedChiffonDress() {
		return driver.findElement(By.id("best-sellers_block_right"));
	}

	public WebElement getBlouse() {
		return driver.findElement(By.id("best-sellers_block_right"));
	}

	public WebElement getSave() {
		return driver.findElement(By.id("best-sellers_block_right")) ;
	}
	public WebElement getAddToWishList() {
		return driver.findElement(By.id("wishlist_button"));
	}
	
	public WebElement getPopUpClose() {
		return driver.findElement(By.id("product"));
	}

	public WebElement getPopUpButton() {
		return driver.findElement(By.id("product"));
	}
	
	public WebElement getDeleteWishList() {
		return driver.findElement(By.id("wishlist_35356"));
	}

	public void insertName () {
		this.getName().sendKeys();
	}
	public void saveClick () {
		this.getSave().click();
	}
	
	public void blouseClick () {
		this.getBlouse().click();
	}
	public void addToWishListClick () {
		this.getAddToWishList().click();
	}
	public void popUpCloseClick () {
	this.getPopUpClose().click();
	}
	public String textFromPopUpButton() {
		return this.getPopUpButton().getText();
		
}
	public void deleteWishListClick() {
		this.getDeleteWishList().click();
	}
	
}
	


