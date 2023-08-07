package paralleldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {
	
	WebDriver driver=null;
	
	
	
@Test //(threadPoolSize = 3,invocationCount = 3, timeOut = 2000)

public void testcase1() throws InterruptedException {
	
	System.out.println("Test1 execution " + Thread.currentThread().getId());
	
	/*
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://google.com");
	Thread.sleep(2000);
	driver.close();
	*/
	
	
}

@Test
public void testcase2() throws InterruptedException {
	
	System.out.println("Test2 execution" + Thread.currentThread().getId());
	
	/*
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(2000);
	driver.close();
	*/
}
@Test
public void testcase3() throws InterruptedException {
	
	System.out.println("Test3 execution" + Thread.currentThread().getId());

}
	
}
