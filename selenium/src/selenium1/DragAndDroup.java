package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		
		WebElement droup= driver.findElement(By.id("form:drop_content"));
		
		
		Actions actions =new Actions(driver);
		
		
		actions.dragAndDrop(drag, droup).build().perform();
		
		driver.quit();

	}

}
