package Demo1.Ecommerce;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.loginpage;
import resources.base;

public class HomepageTest extends base{

	public static Logger log=  LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
	
	
	
	@BeforeTest
	public void initialise() throws IOException {
		
		
		driver=initialisebrowser();
	
		log.info("browser is instantiated");
		
	}
	@Test(dataProvider="getData")
	public void logindemo(String username, String password) {
		driver.get(prop.getProperty("url"));
		landingpage l= new landingpage(driver);
		l.home().click();
		
		
		loginpage lp= l.loginclick();
		
		log.info("login page is opened");
		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		lp.login().click();
		log.info("valid credentials are entered");
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
		log.info("browser is closed");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="kasthuri@gmail.com";
		data[0][1]="q212e";
		
		
		data[1][0]= "user@phptravels.com";
		data[1][1]="demouser";
		
		
		return data;
		
	}
	
	
}
