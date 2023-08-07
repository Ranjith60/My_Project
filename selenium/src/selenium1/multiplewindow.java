package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub




		System.setProperty("webDriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		String oldwindow =driver.getWindowHandle();

		WebElement firstbutton  =driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));

		firstbutton.click();

		Set<String> newwindow=driver.getWindowHandles();


		for (String handles : newwindow) {

			driver.switchTo().window(handles);


		}

		WebElement click = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a"));
		click.click();


		driver.close();

		driver.switchTo().window(oldwindow);


		WebElement multiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));

		multiple.click();


		int noofwindows= driver.getWindowHandles().size();
		System.out.println("no of windows :" + noofwindows);



		WebElement closeonebyone =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));

		closeonebyone.click();

		Set<String> clsoewindow =driver.getWindowHandles();


		for (String allwindow : clsoewindow) {

			if (!allwindow.equals(oldwindow)) {

				driver.switchTo().window(allwindow);
				Thread.sleep(3000);

				driver.close();

				Thread.sleep(3000);


			}


		}

		driver.quit();










	}

}
