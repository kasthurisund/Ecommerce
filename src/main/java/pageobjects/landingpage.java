package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {

	public WebDriver driver;
	public landingpage(WebDriver driver) {
		this.driver=driver;
		
		
		
	}
	By myaccount=By.cssSelector("div.dropdown.dropdown-login.dropdown-tab");
	By login=By.xpath("//a[text()='Login']");
	By currency=By.cssSelector("div.dropdown.dropdown-currency");
	
	public WebElement home() {
		return driver.findElement(myaccount);
		
	}
	public loginpage loginclick() {
		driver.findElement(login).click();
		loginpage lp= new loginpage(driver);
		return lp;
		
	}
	
	public WebElement currency() {
		return driver.findElement(currency);
		
	}
}
