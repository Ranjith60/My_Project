package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		
		
		WebElement homepage=driver.findElement(By.linkText("Go to Dashboard"));
		
		homepage.click();
		
		driver.navigate().back();
		
		
		
		WebElement wheretogo =driver.findElement(By.partialLinkText("Find the URL"));
		
		String togo=wheretogo.getAttribute("href");
	
		System.out.println("Going to :" + togo );
		
		
		
		WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		
		String title=driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("erro :"+ title);
			
		}
		
		driver.navigate().back();
		
		
		
		
		List<WebElement> count  =driver.findElements(By.tagName("a"));
		
		int link= count.size();
		
		System.out.println("count of link :" + link );
		
		
	}

}
