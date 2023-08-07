package UdemymavenExtent.Extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportExtent {
ExtentReports extents;
	@BeforeTest
public void config()
{
 
		// Extentreports, ExtentsparkReport
		
	    String	path=System.getProperty("user.dir")+"//reportExtent//index.html";
		ExtentSparkReporter  report=new ExtentSparkReporter(path);
        report.config().setReportName("AUTOMATION REPORT");
        report.config().setDocumentTitle("test extent result");
        
        ExtentReports extents=new ExtentReports();
        extents.attachReporter(report);
        extents.setSystemInfo("Tester", "Ranjithkumar");

}
	
	@Test
	public void logindemo()
	{
		extents.createTest("login demo");
		System.setProperty("WebDriver.Chrome.driver","/Users/ranjithkumar/Downloads/chromedriver_mac64.zip");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		extents.flush();
	}
	
	
	
	
	
	
}
