package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webDriver.chrome.driver", "chromedriver");

WebDriver driver = new ChromeDriver();
		
driver.get("https://demo.guru99.com/test/newtours/");

driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();

driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("kumar");

driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("ram");

Thread.sleep(2000);

WebElement droupdown = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));

Select select= new Select(droupdown);


select.selectByValue("AUSTRALIA");

Thread.sleep(2000);




driver.close();
				
		
				
				
				
				
				
				
				
		

	}

}
