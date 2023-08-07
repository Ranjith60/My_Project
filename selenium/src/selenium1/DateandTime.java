package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DateandTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String Month = "June 2023";
		String Day = "25";

		System.setProperty("webDriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();

		//click checkin date
		driver.findElement(By.xpath("//input[@id=\"checkin\"]")).click();
		Thread.sleep(2000);

		//condition to satisfy until the date in the calendar month matches my month
		while (true) {
		String text =driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();

		if (text.equals(Month)) {
		break;  // it will break when calendar month matches my month
		}else {
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]")).click(); 
		Thread.sleep(2000);
		}
		}
		//
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+Day+")]")).click();
		driver.close();
		}		
		
		
		
		
		
	
		
}		
	


