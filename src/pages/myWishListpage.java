package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myWishListpage {
	
	
	WebDriver driver;
	WebElement name;
	WebElement name1;
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

	public WebElement getBlouse() {
		return driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a"));
	}

	public WebElement getSave() {
		return driver.findElement(By.id("submitWishlist")) ;
	}
	public WebElement getAddToWishList() {
		return driver.findElement(By.id("wishlist_button"));
	}
	
	public WebElement getPopUpClose() {
		return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")); 
	}

	public WebElement getPopUpButton() {
		return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/div/p"));
	}
	
	public WebElement getDeleteWishList() {
		return driver.findElement(By.className("icon-remove"));
	}  
	public WebElement getName1() {
		return driver.findElement(By.name("name"));
	}

	
	public void insertName (String name) {
		this.getName().sendKeys(name);
	}
	public void insertName1 (String name1) {
		this.getName1().sendKeys(name1);
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
	


