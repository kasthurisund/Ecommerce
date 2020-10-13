package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public WebDriver driver;
 public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//button[@type='submit']");
	
	
	public WebElement email() {
		return driver.findElement(email);
		
	}
	
	public WebElement password() {
		return driver.findElement(password);
		
	}
	
	public WebElement login() {
		return driver.findElement(login);
		
	}
}
