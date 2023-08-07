package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertiondemo {
	
	@Test(enabled=false)
	
	public void asserttest1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		String currenttitle=driver.getTitle();
		
		// Hard Assert example - rule is terminating the execution when ever test case conditions fails
		
		// Assert.assertEquals(currenttitle, "Google", "please verfiy the current url");
		
		boolean flag=false;
		
		if (currenttitle.contains("Goo")) {
			flag=true;
			
		}
		
		
		
		
		Assert.assertTrue(flag, "verfing the current url");
		
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
	}
	
	
	@Test
	
	public void asserttest2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		String currenttitle=driver.getTitle();
		
		SoftAssert softassert=new SoftAssert();
		
		
		// softassert.assertEquals(currenttitle, "google" , "please verfiy the current url");
		
		
		boolean flag=false;
		
		if (currenttitle.contains("ture")) {
			flag=true;
		}
		
		softassert.assertTrue(flag, "verfiying the current url");
		
		driver.navigate().refresh();
		driver.close();
		
	softassert.assertAll();
		
		
	}
	
	
	
	
	
	

}
