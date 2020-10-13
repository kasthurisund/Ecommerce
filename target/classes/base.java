package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initialisebrowser() throws IOException {
    prop= new Properties();
	
	
	FileInputStream fis= new FileInputStream("C:/Workspace/Ecommerce/src/main/java/resources/data.properties");
	
	prop.load(fis);
	

	String browsername= prop.getProperty("browser");
	
	System.out.println(browsername);
	
	
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "c:/Apps/chromedriver.exe");
		driver=new ChromeDriver();
		
			
	}
	else if(browsername.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", "c:\\firefoxdriver.exe");
		driver= new FirefoxDriver();
	}
	
	else if(browsername.equals("IE")) {
		System.setProperty("webdriver.ie.driver", "c:\\internetexplorer.exe");
		driver= new InternetExplorerDriver();
	}
	
	return driver;
	
	}
	
	
	public String getscreenshot(String testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("User.dir")+"\\reports\\"+testcasename+".png";
		//FileUtils.copyFile(source,new File(destination));
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
