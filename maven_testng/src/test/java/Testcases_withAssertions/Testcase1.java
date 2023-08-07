package Testcases_withAssertions;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Testcase1 {
	
	WebDriver driver; 
	
	//(enabled=false) 
	
	
  @Test(priority = 2)
  // depends on group (groups="smoke")
  // dependson menthod(groups= {"smoke","functional","regression"})
  public void testcase1() {
	  
	  WebElement about=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a/span"));
	  
//	  Select select=new Select(about);
	  
//	  select.selectByIndex(1);
	  
	  about.click();
	  
	  
	  String title=driver.getTitle();
	  
	  System.out.println("my current title  : " + title);
	  
	  Assert.notNull(title,"project");
	  
	  
	  
  }
  
  @Test(priority = 1)
  // depends on group (dependsOnGroups = "smoke", groups= {"regression"}) 
  //dependson menthod (dependsOnMethods = "testcase1",groups= {"smoke","regression"})
  
  public void testcase2() {
	  
	  WebElement download=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a"));
	  download.click();
	  
	  String title=driver.getTitle();
	  
	  System.out.println("my current page is :" + title);
	  
	  String dependancy=driver.findElement(By.xpath("(//pre)[1]")).getText();
	  System.out.println(" copied text : " + dependancy);
	  
  }
  
  @Test (priority = 3)
  
  public void testcase3() {
	  
	  WebElement support=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a"));
	  support.click();
	  
	  
	  WebElement linkclick=driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div/p[1]/a"));
	  linkclick.click();
  }
  
  
  
  
@BeforeClass(alwaysRun = true)
@Parameters("browser")

  public void beforeClass( String browser) {
	  
//	  System.setProperty("WebDriver.Chrome.driver","/Users/ranjithkumar/AUTOMATIONS/maven_testng/drivers/chromedriver_mac64");
//	  driver=new ChromeDriver();
	  
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("safari")){
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
			
		}
	
	
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.selenium.dev/projects/");
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	   
  }




  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  
	  driver.quit();
  }

}



