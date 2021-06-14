package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
	
	WebDriver driver;
	WebElement SignInTab;
	
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	}
	public void  SignInTabClick() {
		this.getSignInTab().click();
	}

	
	
}
