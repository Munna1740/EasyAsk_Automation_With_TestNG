package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scrolling extends DriverSetup {
	
	
	@Test
	public static void scrolling() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to bottom
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(3000);
		
		// scroll specific 
		WebElement specificLoc = driver.findElement(By.xpath("/html/body/div/main/div[6]/h2"));
		
		js.executeScript("arguments[0].scrollIntoView();", specificLoc);
		Thread.sleep(3000);

		
	}

}
