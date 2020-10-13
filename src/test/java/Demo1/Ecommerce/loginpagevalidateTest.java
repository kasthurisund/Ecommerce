package Demo1.Ecommerce;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.landingpage;
import resources.base;

public class loginpagevalidateTest extends base{

	public WebDriver driver;
	
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=initialisebrowser();
		
	}
	@Test
	
	public void validatepage() {
		driver.get(prop.getProperty("url"));
		landingpage l= new landingpage(driver);
		String s=l.currency().getText();
	Assert.assertEquals("SGD", s);
		System.out.println(s);
		
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
	
}
