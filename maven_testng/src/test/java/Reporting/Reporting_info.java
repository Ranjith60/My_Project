package Reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reporting_info {
	
@Test	
	public void report() {
		
		
		Reporter.log("setting up the chrome driver", true);
		WebDriverManager.chromedriver().setup();
		
		Reporter.log("launching the chrome \n");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		Reporter.log("current page title is : " + title, true );
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	

}
