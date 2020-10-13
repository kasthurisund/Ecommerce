package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extenreport {
static ExtentReports extent;

	public static ExtentReports getreport() {
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	
	ExtentSparkReporter reporter= new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Test results");
	reporter.config().setReportName("web automation test");
	
	
	
	extent= new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Tester");
	
	return extent;
	
	
	
	}
	
}
